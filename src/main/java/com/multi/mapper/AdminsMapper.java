package com.multi.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.multi.DTO.AdminsDTO;
import com.multi.frame.MyMapper;
@Repository
@Mapper
public interface AdminsMapper extends MyMapper<String, AdminsDTO>{

}
