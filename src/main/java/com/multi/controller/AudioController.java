package com.multi.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.ItemDTO;
import com.multi.service.ItemService;

@Controller
public class AudioController {
	@Autowired
	ItemService service;

	@RequestMapping("earphone")
	public String smartphone(Model model) {
		List<ItemDTO> list = null;
		try {
			list = service.finditem(101);
			model.addAttribute("list",list);
			model.addAttribute("center","/audio/earphone");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	@RequestMapping("headphone")
	public String smartwatch(Model model) {
		List<ItemDTO> list = null;
		try {
			list = service.finditem(102);
			model.addAttribute("list",list);
			model.addAttribute("center","/audio/headphone");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	
}
