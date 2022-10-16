package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.CartDTO;
import com.multi.dto.OrderlistDTO;
import com.multi.frame.MyMapper;
@Repository
@Mapper
public interface OrderlistMapper extends MyMapper<Integer, OrderlistDTO>{
	public List<OrderlistDTO> orderlistall(String custid) throws Exception;
	public List<OrderlistDTO> orderlistall2(String custid) throws Exception;
	public List<OrderlistDTO> registerall(String custid) throws Exception;

}
