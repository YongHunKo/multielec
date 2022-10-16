package com.multi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multi.dto.OrderdetailDTO;
import com.multi.dto.OrderlistDTO;
import com.multi.frame.MyService;
import com.multi.mapper.OrderdetailMapper;
@Service
public class OrderdetailService implements MyService<Integer, OrderdetailDTO>{

    @Autowired
    OrderdetailMapper mapper;
    
    @Override
    public void register(OrderdetailDTO v) throws Exception {
        mapper.insert(v);
        // TODO Auto-generated method stub
        
    }

    @Override
    public void remove(Integer k) throws Exception {
        mapper.delete(k);
        // TODO Auto-generated method stub
        
    }

    @Override
    public void modify(OrderdetailDTO v) throws Exception {
        mapper.update(v);
        // TODO Auto-generated method stub
        
    }

    @Override
    public OrderdetailDTO get(Integer k) throws Exception {
        // TODO Auto-generated method stub
        return mapper.select(k);
    }

    @Override
    public List<OrderdetailDTO> getall() throws Exception {
        // TODO Auto-generated method stub
        return mapper.selectall();
    }

	public List<OrderdetailDTO> orderlistall(String custid) {
		// TODO Auto-generated method stub
		return null;
	}

}
