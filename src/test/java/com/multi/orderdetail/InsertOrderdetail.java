package com.multi.orderdetail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.OrderdetailDTO;
import com.multi.dto.OrderlistDTO;
import com.multi.service.OrderdetailService;
import com.multi.service.OrderlistService;

@SpringBootTest
class InsertOrderdetail {
	@Autowired
	OrderdetailService service;

	@Test
	void contextLoads() {
		try {
			service.register(new OrderdetailDTO(11,6,11,"item11","배송준비",3000,1));
			System.out.println("insert_OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
