package com.multi.item;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.ItemDTO;
import com.multi.service.ItemService;

@SpringBootTest
class UpdateItem {
	@Autowired
	ItemService service;

	@Test
	void contextLoads() {
		try {
			service.modify(new ItemDTO(1, 101, "b", 2000, "img02", 11, null));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
