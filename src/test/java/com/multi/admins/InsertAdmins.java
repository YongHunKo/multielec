package com.multi.admins;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.DTO.AdminsDTO;
import com.multi.service.AdminsService;

@SpringBootTest
class InsertAdmins {
	@Autowired
	AdminsService service;

	@Test
	void contextLoads() {
		try {
			service.register(new AdminsDTO("admin01", "pwd01", "M"));
			System.out.println("Register OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
