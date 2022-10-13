package com.multi.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.ItemDTO;
import com.multi.service.ItemService;

@Controller
public class PaymentController {
	@Autowired
	ItemService service;
	
	@RequestMapping("payment")
	public String payment(Model model) {
		List<ItemDTO> list = null;
		try {
			list = service.finditem(301);
			model.addAttribute("list",list);
			model.addAttribute("center","/payment");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}

}