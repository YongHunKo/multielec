package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.CartDTO;
import com.multi.frame.MyMapper;

@Repository
@Mapper
public interface CartsMapper {

	/* 카트 수량 수정 */
	public Integer modifyCount(CartDTO cart);
	

}
