package com.multi.controller;

import java.util.*;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
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
			model.addAttribute("myInfo",list);
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
		CustDTO cust = null;
		try {
			list = cart_service.cartall(id);
			cust = cust_service.get(id);
			model.addAttribute("mycart",list);
			model.addAttribute("mycust",cust);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("center","/payment");
		return "index";
	}
	
	@RequestMapping("/paymentimpl")
	public String paymentimpl(Model model, String custid, String shipname, String shiptel, String shipaddr) {
		List<CartDTO> list = null;
		int cnt = 0;
		int totalprice = 0;
		int price = 0;
		int itemid = 0;
		String itemname = null;
		try {
			list= cart_service.registerall(custid);
			for(CartDTO o:list) {
				cnt +=o.getCnt();
				price = o.getPrice();
				itemid = o.getItemid();
				itemname = o.getItemname();
				totalprice +=o.getCnt()*o.getPrice();
				//여기서 for문을 나가야했나? 4조를 참고해보니 여기서 첫번째 for문을 끝내고 위 데이터들을 order에 저장한다
			}
				OrderlistDTO order = new OrderlistDTO(null, custid,cnt, null, totalprice, null, null, null, null, null,null, null,null);
				//오더리스트에 넣는것들은 다 끝
				orderlist_service.register(order);
				int r = order.getOrderid();
				//그리고 여기서 두번째 for문을 list에 맞게 돌려서 처리한다
			
			for(CartDTO o:list) {
				OrderdetailDTO orderdetail = new OrderdetailDTO(null, r, o.getItemid(), o.getItemname(), "배송완료", o.getPrice(), o.getCnt());
				ShipDTO ship = new ShipDTO(null, r, shipname, shipaddr, shiptel);
				
				orderdetail_service.register(orderdetail);
				ship_service.register(ship);
				cart_service.remove(o.getCartid());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		일단 원하는데로 들어가는게 확인되었다 근데 수량과 itemid나 다른것들이 안맞는다
		//오더리스트는 된거같다 근데 이제 오더디테일에서 값이 같은걸로 들어간다
		return "index";
	}
	
	
	
	//커밋테스트
	
	
}




	