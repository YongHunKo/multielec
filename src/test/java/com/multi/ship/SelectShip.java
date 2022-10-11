package com.multi.ship;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.ShipDTO;
import com.multi.service.ShipService;

@SpringBootTest
class SelectShip {
	@Autowired
	ShipService service;

	@Test
	void contextLoads() {
		ShipDTO ship = null;
		try {
			ship = service.get(2);
			System.out.println(ship);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
