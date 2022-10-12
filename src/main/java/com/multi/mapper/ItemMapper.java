package com.multi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.ItemDTO;
import com.multi.frame.MyMapper;
@Repository
@Mapper
public interface ItemMapper extends MyMapper<Integer, ItemDTO>{
	List<ItemDTO> finditem(Integer cateid) throws Exception;

	public List<ItemDTO> searchitem(String txt) throws Exception;
}