package com.multi.ship;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.OrderlistDTO;
import com.multi.dto.ShipDTO;
import com.multi.service.ShipService;

@SpringBootTest
class SelectAllShip {
	@Autowired
	ShipService service;

	@Test
	void contextLoads() {
		List<ShipDTO> list = null;
		try {
			list = service.getall();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for(ShipDTO s:list) {
			System.out.println(s);
		}
	}

}
