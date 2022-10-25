package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.CartDTO;
import com.multi.mapper.CartsMapper;

public interface CartsService {
	
	/* 장바구니 추가 */
	public int addCart(CartDTO cart);
	
	
	
	/* 카트 수량 수정 */
	public Integer modifyCount(CartDTO cart);		
	
	/* 카트 삭제 */
	public int deleteCart(int cartid);	

}
