package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.ShipDTO;
import com.multi.frame.MyService;
import com.multi.mapper.ShipMapper;
@Service
public class ShipService implements MyService<Integer, ShipDTO>{

	@Autowired
	ShipMapper mapper;

	@Override
	public void register(ShipDTO v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(ShipDTO v) throws Exception {
		mapper.update(v);
	}

	@Override
	public ShipDTO get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<ShipDTO> getall() throws Exception {
		return mapper.selectall();
	}
	

}
