package com.multi.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.CustDTO;
import com.multi.service.CustService;

@Controller
public class MainController {
	@Autowired
	CustService custservice;
	@RequestMapping("/")
	public String main() {
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
	
}
