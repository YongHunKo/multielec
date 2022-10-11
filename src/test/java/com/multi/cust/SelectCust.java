package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CustDTO;
import com.multi.service.CustService;

@SpringBootTest
class SelectCust {
    @Autowired
    CustService service;

	@Test
	void contextLoads() {
	    CustDTO cust = null;
	    try {
            cust = service.get("id01");
            System.out.println(cust);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}

}
