package com.multi.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class OrderlistDTO {
	private Integer orderid;
	private String custid;
	private Integer cnt;
	private Date orderdate;
	private Integer totalprice;

	//추가되는거
	
	private String shipsearch;
	private String itemname;
	private String img;
	private Integer itemprice;
	private Integer itemcnt;
	private Integer itemid;
}
