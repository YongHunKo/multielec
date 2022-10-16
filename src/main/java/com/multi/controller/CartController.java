package com.multi.controller;

import java.util.*;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.CartDTO;
import com.multi.dto.CustDTO;
import com.multi.dto.OrderdetailDTO;
import com.multi.dto.OrderlistDTO;
import com.multi.dto.ShipDTO;
import com.multi.service.CartService;
import com.multi.service.CustService;
import com.multi.service.OrderdetailService;
import com.multi.service.OrderlistService;
import com.multi.service.ShipService;

@Controller
public class CartController {

	@Autowired
	CartService cart_service;
	@Autowired
	CustService cust_service;
	@Autowired
	OrderlistService orderlist_service;
	@Autowired
	OrderdetailService orderdetail_service;
	@Autowired
	ShipService ship_service;
	
	@RequestMapping("/cart")
	public String cart(Model model, String id) {
		List<CartDTO> list = null;
		CustDTO cust = null; 
		try {
			list = cart_service.cartall(id);
			cust = cust_service.get(id);
			model.addAttribute("mycart",list);
			model.addAttribute("mypricecart",list);
			model.addAttribute("custdetail",cust);
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("center", "cart");
		return "index";
	
	}
	
	@RequestMapping("/deletecart")
	public String deletecart(Model model, int id, String custid) {
		try {
			cart_service.remove(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:cart?id="+custid;
	}
	
	@RequestMapping("/cartpayment")
	public String cartpayment(Model model, HttpSession session, CustDTO cust) {
		model.addAttribute("center","/payment");
		return "redirect:payment?id"+cust.getCustid();
	}//얘는 이동하는 애
	
	@RequestMapping("/payment")
	public String payment(Model model, String id) {
		List<CartDTO> list = null;
		try {
			list = cart_service.cartall(id);
			model.addAttribute("mycart",list);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("center","/payment");
		return "index";
	}
	
	@RequestMapping("/paymentimpl")
	public String paymentimpl(Model model, String custid, String shipname, String shiptel, String shipaddr) {
		List<CartDTO> list = null;
		try {
			list= cart_service.registerall(custid);
			for(CartDTO o:list) {
				int cnt =o.getCnt();
				int price = o.getPrice();
				int itemid = o.getItemid();
				String itemname = o.getItemname();
				int totalprice =cnt*price;
				OrderlistDTO order = new OrderlistDTO(null, custid,cnt, null, totalprice, null, null, null, null, null,null, null,null);
				//오더리스트에 넣는것들은 다 끝
				orderlist_service.register(order);
				int r = order.getOrderid();
				OrderdetailDTO orderdetail = new OrderdetailDTO(null, r, itemid, itemname, "배송준비", price, cnt);
				ShipDTO ship = new ShipDTO(null, r, shipname, shipaddr, shiptel);
				
				orderdetail_service.register(orderdetail);
				ship_service.register(ship);
			}
			for(CartDTO o:list) {
				cart_service.remove(o.getCartid());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		model.addAttribute("center","/paymentok");
		return "index";
	}
}




	