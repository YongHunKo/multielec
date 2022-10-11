package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CustDTO;
import com.multi.service.CustService;

@SpringBootTest
class InsertCust {
    @Autowired
    CustService service;

	@Test
	void contextLoads() {
	    try {
            service.register(new CustDTO("id01", "pwd01", "고용훈", "M", 30, null, null, null, null));
            System.out.println("insert_ok");
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
