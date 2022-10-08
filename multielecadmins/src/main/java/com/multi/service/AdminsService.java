package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.DTO.AdminsDTO;
import com.multi.frame.MyService;
import com.multi.mapper.AdminsMapper;
@Service
public class AdminsService implements MyService<String, AdminsDTO>{

	@Autowired
	AdminsMapper mapper;
	
	@Override
	public void register(AdminsDTO v) throws Exception {
		mapper.insert(v);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(String k) throws Exception {
		mapper.delete(k);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(AdminsDTO v) throws Exception {
		mapper.update(v);
		// TODO Auto-generated method stub
		
	}

	@Override
	public AdminsDTO get(String k) throws Exception {
		// TODO Auto-generated method stub
		return mapper.select(k);
	}

	@Override
	public List<AdminsDTO> getall() throws Exception {
		// TODO Auto-generated method stub
		return mapper.selectall();
	}

}
