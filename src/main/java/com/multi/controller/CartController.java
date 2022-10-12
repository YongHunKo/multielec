package com.multi.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.CartDTO;
import com.multi.service.CartService;

@Controller
public class CartController {

	@Autowired
	CartService cart_service;

	
//	@RequestMapping("/cart")
//	public String cart(Model model, String custid) {
//		List<CartDTO> list = null;
//		try {
//			list = cart_service.cartall(custid);
//			model.addAttribute("mycart",list);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		model.addAttribute("center", "cart");
//		return "index";
//	}
	 

	@RequestMapping("/deletecart")
	public String deletecart(Model model, int cateid, String custid) {
		try {
			cart_service.remove(cateid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:cart?id=" + custid;
	}

	@RequestMapping("/addcart")
	public Object addcart(CartDTO cart) {
		try {
			cart_service.register(cart);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "";
	}
}