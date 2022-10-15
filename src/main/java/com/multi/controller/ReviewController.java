package com.multi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.ReviewDTO;
import com.multi.service.ReviewService;

@Controller
public class ReviewController {
	@Autowired
	ReviewService review_service;
	@RequestMapping("/reviewimpl")
	public String reviewimpl(String custid, Integer itemid, String rvtxt) {
		System.out.println(rvtxt);
		System.out.println(itemid);
		System.out.println(custid);
		ReviewDTO review = new ReviewDTO(null, itemid, custid, rvtxt, null);
		try {
			review_service.register(review);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "index";
	}

}
