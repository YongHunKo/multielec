package com.multi.carts;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CartDTO;
import com.multi.service.CartsService;

@SpringBootTest
class ModifyCountCart {

	@Autowired
	CartsService service;
	
	@Test
	void contextLoads() {
		CartDTO cart = new CartDTO(3, null, null, 555, null, null, null, null);
		try {
			service.modifyCount(cart);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("updated");
	}
}

