package com.multi.review;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.ReviewDTO;
import com.multi.service.ReviewService;

@SpringBootTest
class InsertReview {
	@Autowired
	ReviewService service;

	@Test
	void contextLoads() {
		ReviewDTO review = new ReviewDTO(0, 10, "id01", "배송 빨리 와서 좋아요", null);
		try {
			service.register(review);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("inserted");
	}

}
