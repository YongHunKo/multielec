package com.multi.orderlist;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.OrderlistDTO;
import com.multi.service.OrderlistService;


@SpringBootTest
class GetAllOrderlist {

	@Autowired
	OrderlistService service;
	
	@Test
	void contextLoads() {
		List<OrderlistDTO> list = null;
		try {
			list = service.orderlistall("id01");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(OrderlistDTO c:list) {
			System.out.println(c);
		}
		
	}

}
