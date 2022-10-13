package com.multi.review;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.ReviewDTO;
import com.multi.service.ReviewService;

@SpringBootTest
class ItemreviewReview {
	@Autowired
	ReviewService service;

	@Test
	void contextLoads() {
		List<ReviewDTO> list = null;
		try {
			list = service.itemreview(2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		for(ReviewDTO r:list) {
			System.out.println(r);
		}
	}

}
