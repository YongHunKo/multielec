package com.multi.ship;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.OrderlistDTO;
import com.multi.dto.ShipDTO;
import com.multi.service.ShipService;

@SpringBootTest
class UpdateShip {

	@Autowired
	ShipService service;
	
	@Test
	void contextLoads() {
		ShipDTO ship = new ShipDTO(11, null, "김철수", "제주도 서귀포시", "01045645678");
		try {
			service.modify(ship);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
