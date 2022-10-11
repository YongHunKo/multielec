package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.CateDTO;
import com.multi.frame.MyService;
import com.multi.mapper.CateMapper;
@Service
public class CateService implements MyService<Integer, CateDTO>{

	@Autowired
	CateMapper mapper;
	
	@Override
	public void register(CateDTO v) throws Exception {
		mapper.insert(v);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(CateDTO v) throws Exception {
		mapper.update(v);
		// TODO Auto-generated method stub
		
	}

	@Override
	public CateDTO get(Integer k) throws Exception {
		// TODO Auto-generated method stub
		return mapper.select(k);
	}

	@Override
	public List<CateDTO> getall() throws Exception {
		// TODO Auto-generated method stub
		return mapper.selectall();
	}

}
