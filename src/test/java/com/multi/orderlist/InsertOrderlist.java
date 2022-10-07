package com.multi.orderlist;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.DTO.OrderlistDTO;
import com.multi.service.OrderlistService;

@SpringBootTest
class InsertOrderlist {
	@Autowired
	OrderlistService service;

	@Test
	void contextLoads() {
		try {
			service.register(new OrderlistDTO(0,"id11", 3, null, 40000));
			System.out.println("insert_OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
