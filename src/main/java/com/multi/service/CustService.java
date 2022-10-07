package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.DTO.CustDTO;
import com.multi.frame.MyService;
import com.multi.mapper.CustMapper;
@Service
public class CustService implements MyService<String, CustDTO>{

	@Autowired
	CustMapper	mapper;
	
	@Override
	public void register(CustDTO v) throws Exception {
		mapper.insert(v);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(String k) throws Exception {
		mapper.delete(k);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(CustDTO v) throws Exception {
		mapper.update(v);
		// TODO Auto-generated method stub
		
	}

	@Override
	public CustDTO get(String k) throws Exception {
		// TODO Auto-generated method stub
		return mapper.select(k);
	}

	@Override
	public List<CustDTO> getall() throws Exception {
		// TODO Auto-generated method stub
		return mapper.selectall();
	}

}
