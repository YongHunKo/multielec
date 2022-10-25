package com.multi.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.multi.dto.CartDTO;
import com.multi.service.CartsService;

@Controller
public class CartsController {
	
	@Autowired
	private CartsService cartsService;

	
	
	/* 장바구니 수량 수정 */
	@PostMapping("/updatecart")
	public String updateCartPOST(CartDTO cart,String custid) {
		
		cartsService.modifyCount(cart);
		
		return "redirect:cart?id=" + cart.getCustid();
		
		
	}	
	
	
	
}
