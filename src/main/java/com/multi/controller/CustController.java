package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.CustDTO;
import com.multi.service.CustService;

@Controller
@RequestMapping("/cust")
public class CustController {

	String dir = "cust/";
	
	@Autowired
	CustService service;
	
	@RequestMapping("/get")
	public String get(Model model) {
		List<CustDTO> list = null;
		try {
			list = service.getall();
			model.addAttribute("list",list);
			model.addAttribute("center",dir+"get");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	
	@RequestMapping("/detail")
	public String detail(Model model, String custid) {
		CustDTO cust = null;
		try {
			cust = service.get(custid);
			model.addAttribute("c",cust);
			model.addAttribute("center",dir+"detail");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	
	@RequestMapping("/update")
	public String update(Model model, CustDTO cust) {
		try {
			service.modify(cust);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:detail?custid="+cust.getCustid();
	}
	
	@RequestMapping("/delete")
	public String delete(Model model, String custid) {
		try {
			service.remove(custid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:get";
	}
	
	@RequestMapping("/register")
	public String register(Model model) {
		model.addAttribute("center",dir+"register");
		return "index";
	}
	
	@RequestMapping("/registerimpl")
	public String registerimpl(Model model, CustDTO cust) {
		try {
			service.register(cust);
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("center",dir+"register");
		return "redirect:get";
	}
}
