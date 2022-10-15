package com.multi.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CartDTO;
import com.multi.service.CartService;

@SpringBootTest
class InsertCart {

	@Autowired
	CartService service;
	
	@Test
	void contextLoads() {
		CartDTO cart = new CartDTO(null, "id11", 13, 3, null, null, null, null);
		try {
			service.register(cart);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("inserted");
	}
}

