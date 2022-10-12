package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cust")
public class CustController {
	
	@RequestMapping("/register")
	public String register(Model model) {
		model.addAttribute("center","cust/register");
		return "index";
	}
	
}
