package com.multi.ship;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.service.ShipService;

@SpringBootTest
class DeleteShip {

	@Autowired
	ShipService service;
	
	@Test
	void contextLoads() {
		try {
			service.remove(11);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
