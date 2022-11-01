package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.multi.mapper.CartsMapper;
import com.multi.dto.CartDTO;
@Service
public class CartsServiceImpl implements CartsService {

	@Autowired
	private CartsMapper cartsMapper;
	
		
		@Override
		public Integer modifyCount(CartDTO cart) {
			return cartsMapper.modifyCount(cart);
		}		
		
		
		
	}

		

