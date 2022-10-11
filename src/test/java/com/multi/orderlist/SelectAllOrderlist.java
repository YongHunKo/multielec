package com.multi.orderlist;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.OrderlistDTO;
import com.multi.service.OrderlistService;

@SpringBootTest
class SelectAllOrderlist {
	@Autowired
	OrderlistService service;

	@Test
	void contextLoads() {
		List<OrderlistDTO> list = null;
		try {
			list = service.getall();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for(OrderlistDTO o:list) {
			System.out.println(o);
		}
	}

}
