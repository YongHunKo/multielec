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
	public int addCart(CartDTO cart) {

		// 장바구니 데이터 체크
		CartDTO checkCart = null;
		try {
			checkCart = cartsMapper.checkCart(cart);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		if(checkCart != null) {
			return 2;
		}
		
		// 장바구니 등록 & 에러 시 0반환
		try {
			return cartsMapper.addCart(cart);
		} catch (Exception e) {
			return 0;
		}		
	}
		
		@Override
		public Integer modifyCount(CartDTO cart) {
			
			return cartsMapper.modifyCount(cart);
		}		
		
		@Override
		public int deleteCart(int cartid) {

			return cartsMapper.deleteCart(cartid);
		}	
		
	}

		

