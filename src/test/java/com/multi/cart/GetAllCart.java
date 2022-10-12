package com.multi.cart;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CartDTO;
import com.multi.service.CartService;


@SpringBootTest
class GetAllCart {

	@Autowired
	CartService service;
	
	@Test
	void contextLoads() {
		List<CartDTO> list = null;
		try {
			list = service.cartall("id01");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(CartDTO c:list) {
			System.out.println(c);
		}
		
	}

}
