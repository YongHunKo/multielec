package com.multi.orderdetail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.OrderdetailDTO;
import com.multi.service.OrderdetailService;

@SpringBootTest
class SelectOrderdetail {
    @Autowired
    OrderdetailService service;

	@Test
	void contextLoads() {
	    try {
	        OrderdetailDTO od = null;
            od = service.get(1);
            System.out.println(od);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}

}
