package com.multi.orderlist;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.OrderlistDTO;
import com.multi.service.OrderlistService;

@SpringBootTest
class MultielecApplicationTests {

	@Autowired
	OrderlistService service;
	
	@Test
	void contextLoads() {
		try {
			service.modify(new OrderlistDTO(1, "id01", 1, null, 111111));
			System.out.println("Update_OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
