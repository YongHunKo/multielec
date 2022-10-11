package com.multi.item;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.ItemDTO;
import com.multi.service.ItemService;

@SpringBootTest
class InsertItem {
	@Autowired
	ItemService service;

	@Test
	void contextLoads() {
		try {
			service.register(new ItemDTO(1, 101, "a", 1000, "img01", 1, null));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
