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
			service.modify(new OrderdetailDTO(34, 73, 22, "갤패드미니", "배송완료", 693000, 1));
			System.out.println("update_OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
