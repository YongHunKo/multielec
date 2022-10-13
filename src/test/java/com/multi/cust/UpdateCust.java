package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CustDTO;
import com.multi.service.CustService;

@SpringBootTest
class UpdateCust {
    @Autowired
    CustService service;

	@Test
	void contextLoads() {
	    try {
            service.modify(new CustDTO("id01", "pwd02", "동우", null, null, null, null, "01012341234", "서울 강남구"));
            System.out.println("update_OK");
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
