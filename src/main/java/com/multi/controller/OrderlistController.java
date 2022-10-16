package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.OrderlistDTO;
import com.multi.service.CustService;
import com.multi.service.OrderlistService;

@Controller
public class OrderlistController {

	@Autowired
	OrderlistService orderlist_service;
	@Autowired
	CustService cust_service;
	
	@RequestMapping("/orderlist")
	public String orderlist(Model model, String id) {
		List<OrderlistDTO> list = null;

		try {
			list = orderlist_service.orderlistall(id);
			model.addAttribute("myordercart",list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("center", "orderlist");
		return "index";
	
	}
	
	@RequestMapping("/reviewlist")
	public String reviewlist(Model model, String id) {
		List<OrderlistDTO> list = null;
		
		try {
			list = orderlist_service.orderlistall2(id);
			model.addAttribute("myreview",list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("center", "reviewlist");
		return "index";
		
	}
	

	@RequestMapping("/deleteorderlist")
	public String deleteorderlist(Model model, int id, String custid) {
		try {
			orderlist_service.remove(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:orderlist?id="+custid;
	}
	

}




	