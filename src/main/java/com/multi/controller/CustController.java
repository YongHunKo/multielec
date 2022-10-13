package com.multi.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.CustDTO;
import com.multi.service.CustService;

@Controller
@RequestMapping("/cust")
public class CustController {
	@Autowired
	CustService custservice;
	
	@RequestMapping("/register")
	public String register(Model model) {
		model.addAttribute("center","cust/register");
		return "index";
	}
	
	@RequestMapping("/registerimpl")
	public String registerimpl(Model model, CustDTO cust, HttpSession session) {
		try {
			custservice.register(cust);
			session.setAttribute("logincust", cust);
			model.addAttribute("center","cust/registerok");
			model.addAttribute("rid",cust);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	

}
