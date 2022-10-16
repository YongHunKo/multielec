package com.multi.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.CustDTO;
import com.multi.dto.ItemDTO;
import com.multi.dto.ReviewDTO;
import com.multi.mapper.ItemMapper;
import com.multi.service.CustService;
import com.multi.service.ItemService;
import com.multi.service.ReviewService;

@Controller
public class MainController {
	@Autowired
	CustService custservice;
	@Autowired
	ItemService itemservice;
	@Autowired
	ReviewService reviewservice;
	@Autowired
	ItemMapper itemmapper;
	
	@RequestMapping("/")
	public String main() {
		return "index";
	}
	
	@RequestMapping("/searchimpl")
	public String searchimpl(Model model, String txt) {
		List<ItemDTO> list = null;
		try {
			list = itemmapper.searchitem(txt);
			model.addAttribute("list", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("center", "search");
		return "index";
	}
	
	@RequestMapping("/loginimpl")
	public String loginimpl(HttpSession session, String custid, String custpwd) {
		CustDTO cust = null;
		try {
			cust = custservice.get(custid);
			if(cust==null) {
				return "redirect:";
			}else {
				if(custpwd.equals(cust.getCustpwd())) {
					session.setAttribute("logincust", cust);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session, String id, String pwd) {
		if(session != null) {
			session.invalidate();
		}
		return "redirect:";
	}
	
	@RequestMapping("/itemdetail")
	public String itemdetail(Model model, Integer itemid) {
		ItemDTO list = null;
		List<ReviewDTO> list2 = null;
		try {
			list = itemservice.get(itemid);
			list2 = reviewservice.itemreview(itemid);
			model.addAttribute("itemdetail",list);
			model.addAttribute("itemreview",list2);
			
			model.addAttribute("center","/detail");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	
	@RequestMapping("/custdetail")
	public String custdetail(Model model, String id) {
		CustDTO cust = null;
		try {
			cust = custservice.get(id);
			model.addAttribute("custdetail", cust);
			model.addAttribute("center","/cust/custdetail");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	
	@RequestMapping("/custupdate")
	public String custupdate(Model model, String id) {
		CustDTO cust = null;
		try {
			cust = custservice.get(id);
			model.addAttribute("custupdate", cust);
			model.addAttribute("center", "/cust/custupdate");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	
	@RequestMapping("/custupdateimpl")
	public String custupdateimpl(Model model, CustDTO cust, HttpSession session) {
		try {
			custservice.modify(cust);
			session.setAttribute("logincust", cust);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:custdetail?id="+cust.getCustid();
	}
	
}
