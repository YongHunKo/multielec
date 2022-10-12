package com.multi.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.ItemDTO;
import com.multi.service.ItemService;

@Controller
public class LaptapController {
	@Autowired
	ItemService service;
	
	@RequestMapping("office")
	public String office(Model model) {
		List<ItemDTO> list = null;
		try {
			list = service.finditem(301);
			model.addAttribute("list",list);
			model.addAttribute("center","/laptop/office");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	@RequestMapping("game")
	public String game(Model model) {
		List<ItemDTO> list = null;
		try {
			list = service.finditem(302);
			model.addAttribute("list",list);
			model.addAttribute("center","/laptop/game");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}

}