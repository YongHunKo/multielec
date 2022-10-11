package com.multi.review;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.service.ReviewService;

@SpringBootTest
class DeleteReview {
	@Autowired
	ReviewService service;

	@Test
	void contextLoads() {
		try {
			service.remove(1);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("deleted");
	}

}
