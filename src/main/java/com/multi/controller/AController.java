package com.multi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multi.dto.CustDTO;
import com.multi.service.CustService;

@RestController
public class AController {
	@Autowired
	CustService custservice;
	@RequestMapping("/checkid")
	public Object checkid(String cid) {
		String result = "";
		CustDTO cust = null;
		try {
			cust= custservice.get(cid);
			if(cust != null) {
				result = "f";
			}else {
				result = "t";				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
