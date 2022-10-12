package com.multi.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.ItemDTO;
import com.multi.service.ItemService;

@Controller
public class MobileController {
	@Autowired
	ItemService service;
	
	@RequestMapping("smartphone")
	public String smartphone(Model model) {
		List<ItemDTO> list = null;
		try {
			list = service.finditem(202);
			model.addAttribute("list",list);
			model.addAttribute("center","/mobile/smartphone");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	@RequestMapping("smartwatch")
	public String smartwatch(Model model) {
		List<ItemDTO> list = null;
		try {
			list = service.finditem(201);
			model.addAttribute("list",list);
			model.addAttribute("center","/mobile/smartwatch");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	@RequestMapping("tablet")
	public String tablet(Model model) {
		List<ItemDTO> list = null;
		try {
			list = service.finditem(203);
			model.addAttribute("list",list);
			model.addAttribute("center","/mobile/tablet");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
}