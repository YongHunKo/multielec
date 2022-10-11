package com.multi.review;

import java.util.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.dto.ReviewDTO;
import com.multi.service.ReviewService;

@SpringBootTest
class SelectAllReview {
	@Autowired
	ReviewService service;

	@Test
	void contextLoads() {
		List<ReviewDTO> list = null;
		try {
			list = service.getall();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(ReviewDTO c:list) {
			System.out.println(c);
		}
	}

}
