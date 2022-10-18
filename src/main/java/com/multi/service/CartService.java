package com.multi.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.CartDTO;
import com.multi.frame.MyService;
import com.multi.mapper.CartMapper;

@Service
public class CartService implements MyService<Integer,CartDTO>{
	
	@Autowired
	CartMapper mapper;
	@Override
	public void register(CartDTO v) throws Exception {
		mapper.insert(v);
		
	}
	/* 장바구니 추가 */
	public int addCart(CartDTO cart) throws Exception {
		return mapper.addCart(cart);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
		
	}
	/* 카트 삭제 */
	public int deleteCart(int cartid)throws Exception {
		return mapper.deleteCart(cartid);
		
	}

	@Override
	public void modify(CartDTO v) throws Exception {
		mapper.update(v);
		
	}
	/* 카트 수량 수정 */
	public int modifyCount(CartDTO cart) throws Exception {
		return mapper.modifyCount(cart);
		
	}	
	
	@Override
	public CartDTO get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<CartDTO> getall() throws Exception {
		return mapper.selectall();
	}
	
	public List<CartDTO> cartall(String custid) throws Exception {
		return mapper.cartall(custid);
	}
	
	public List<CartDTO> registerall(String custid) throws Exception {
		return mapper.registerall(custid);
	}
	
	/* 장바구니 정보 리스트 */
	public List<CartDTO> getCartList(String custid) throws Exception {
		return mapper.getCartList(custid);	
	}
	
	
}
