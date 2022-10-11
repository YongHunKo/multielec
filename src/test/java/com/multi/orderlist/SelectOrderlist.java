package com.multi.orderlist;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.OrderlistDTO;
import com.multi.service.OrderlistService;

@SpringBootTest
class SelectOrderlist {
	@Autowired
	OrderlistService service;

	@Test
	void contextLoads() {
		OrderlistDTO order = null;
		try {
			order = service.get(11);
			System.out.println(order);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
