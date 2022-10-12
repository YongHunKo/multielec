package com.multi.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.CustDTO;
import com.multi.dto.ItemDTO;
import com.multi.mapper.ItemMapper;
import com.multi.service.CustService;
import com.multi.service.ItemService;

@Controller
public class MainController {
	@Autowired
	CustService custservice;
	@Autowired
	ItemService itemservice;
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
		try {
			list = itemservice.get(itemid);
			model.addAttribute("itemdetail",list);
			model.addAttribute("center","/detail");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	
}
