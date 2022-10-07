package com.multi.cust;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.DTO.CustDTO;
import com.multi.service.CustService;

@SpringBootTest
class SelectAllCust {
	@Autowired
	CustService service;

	@Test
	void contextLoads() {
		List<CustDTO> list = null;
		try {
			list = service.getall();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(CustDTO c:list) {
			System.out.println(c);
		}
	}

}
