package com.multi.cate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.CateDTO;
import com.multi.service.CateService;

@SpringBootTest
class InsertCate {
    @Autowired
    CateService service;

	@Test
	void contextLoads() {
	    try {
            service.register(new CateDTO(1, 0, "음향기기"));
            System.out.println("insert_OK");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}

}
