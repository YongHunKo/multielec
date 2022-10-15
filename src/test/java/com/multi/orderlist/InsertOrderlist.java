package com.multi.orderlist;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.OrderdetailDTO;
import com.multi.dto.OrderlistDTO;
import com.multi.service.OrderdetailService;
import com.multi.service.OrderlistService;

@SpringBootTest
class InsertOrderlist {
	@Autowired
	OrderlistService orderlist_service;
	@Autowired
	OrderdetailService orderdetail_service;

	@Test
	void contextLoads() {
		OrderlistDTO order = new OrderlistDTO(0,"id11", 3, null, 40000,null,null,null,null,null,null);
		try {
			orderlist_service.register(order);
			int r = order.getOrderid();
			System.out.println("insert_OK"+" "+r);
			OrderdetailDTO orderdetail = new OrderdetailDTO(null, r, null, null, null, null, null);
			orderdetail_service.register(orderdetail);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
