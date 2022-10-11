package com.multi.ship;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.OrderlistDTO;
import com.multi.dto.ShipDTO;
import com.multi.service.ShipService;

@SpringBootTest
class InsertShip {
	@Autowired
	ShipService service;

	@Test
	void contextLoads() {
		ShipDTO ship = new ShipDTO(null, 2, "홍길동", "제주도 제주시", "01012341234");
		try {
			service.register(ship);
			// System.out.println(ship);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
