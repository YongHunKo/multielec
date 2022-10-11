package com.multi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.dto.ShipDTO;
import com.multi.frame.MyMapper;
@Repository
@Mapper
public interface ShipMapper extends MyMapper<Integer, ShipDTO>{

}
