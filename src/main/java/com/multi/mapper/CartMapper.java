package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.CartDTO;
import com.multi.frame.MyMapper;

@Repository
@Mapper
public interface CartMapper extends MyMapper<Integer,CartDTO> {
	public List<CartDTO> cartall(String custid) throws Exception;
	public List<CartDTO> registerall(String custid) throws Exception;
	
	/* 카트 추가 */
	public int addCart(CartDTO cart) throws Exception;
	
	/* 카트 삭제 */
	public int deleteCart(int cartid)throws Exception;
	
	/* 카트 수량 수정 */
	public int modifyCount(CartDTO cart)throws Exception;
	
	/* 카트 목록 */
	public List<CartDTO> getCart(String custid)throws Exception;	
	
	/* 카트 확인 */
	public CartDTO checkCart(CartDTO cart)throws Exception;	
	
	/* 카트 제거(주문) */
	public int deleteOrderCart(CartDTO dto)throws Exception;
	
	public List<CartDTO> getCartList(String custid)throws Exception;	
	

	
}
