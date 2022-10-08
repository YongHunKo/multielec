package com.multi.admins;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.DTO.AdminsDTO;
import com.multi.service.AdminsService;

@SpringBootTest
class SelectAllAdmins {
	@Autowired
	AdminsService service;

	@Test
	void contextLoads() {
		List<AdminsDTO> list = null;
		try {
			list = service.getall();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for(AdminsDTO a:list) {
			System.out.println(a);
		}
	}

}
