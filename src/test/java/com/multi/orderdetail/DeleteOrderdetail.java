package com.multi.orderdetail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.service.OrderdetailService;

@SpringBootTest
class DeleteOrderdetail {
    @Autowired
    OrderdetailService service;

	@Test
	void contextLoads() {
	    try {
            service.remove(11);
            System.out.println("delete_ok");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}

}
