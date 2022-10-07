package com.multi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.DTO.CustDTO;
import com.multi.frame.MyMapper;
@Repository
@Mapper
public interface CustMapper extends MyMapper<String, CustDTO>{

}
