package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.CartDTO;
import com.multi.frame.MyMapper;

@Repository
@Mapper
public interface CartsMapper {

	/* 카트 추가 */
	public int addCart(CartDTO cart) throws Exception;
	
	/* 카트 삭제 */
	public int deleteCart(int cartid);
	
	/* 카트 수량 수정 */
	public Integer modifyCount(CartDTO cart);
	
	/* 카트 목록 */
	public List<CartDTO> getCart(String custid);	
	
	/* 카트 확인 */
	public CartDTO checkCart(CartDTO cart);	
	
	/* 카트 제거(주문) */
	public int deleteOrderCart(CartDTO dto);	
	
}
