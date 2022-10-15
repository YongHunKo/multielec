package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.ItemDTO;
import com.multi.service.ItemService;

@Controller
@RequestMapping("/item")
public class ItemController {

	String dir = "item/";
	
	@Autowired
	ItemService service;
	
	@RequestMapping("/get")
	public String get(Model model) {
		List<ItemDTO> list = null;
		try {
			list = service.getall();
			model.addAttribute("list",list);
			model.addAttribute("center",dir+"get");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	
	@RequestMapping("/itemdetail")
	public String itemdetail(Model model, int id) {
		ItemDTO list = null;
		try {
			list = service.get(id);
			model.addAttribute("itemdetail",list);
			model.addAttribute("center",dir+"detail");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	
	@RequestMapping("/register")
	public String register(Model model) {
		model.addAttribute("center",dir+"register");
		return "index";
	}
}
