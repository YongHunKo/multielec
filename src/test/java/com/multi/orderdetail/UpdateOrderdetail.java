package com.multi.orderdetail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.OrderdetailDTO;
import com.multi.dto.OrderlistDTO;
import com.multi.service.OrderdetailService;
import com.multi.service.OrderlistService;

@SpringBootTest
class UpdateOrderdetail {
	@Autowired
	OrderdetailService service;

	@Test
	void contextLoads() {
		try {
			service.modify(new OrderdetailDTO(11, 5, 10, "item10", "배송완료", 1000, 3));
			System.out.println("update_OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
