package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.CartDTO;
import com.multi.dto.OrderlistDTO;
import com.multi.frame.MyService;
import com.multi.mapper.OrderlistMapper;
@Service
public class OrderlistService implements MyService<Integer, OrderlistDTO>{

	@Autowired
	OrderlistMapper mapper;
	@Override
	public void register(OrderlistDTO v) throws Exception {
		mapper.insert(v);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(OrderlistDTO v) throws Exception {
		mapper.update(v);
		// TODO Auto-generated method stub
		
	}

	@Override
	public OrderlistDTO get(Integer k) throws Exception {
		// TODO Auto-generated method stub
		return mapper.select(k);
	}

	@Override
	public List<OrderlistDTO> getall() throws Exception {
		// TODO Auto-generated method stub
		return mapper.selectall();
	}
	public List<OrderlistDTO> orderlistall(String custid) throws Exception {
		return mapper.orderlistall(custid);
	}

}
