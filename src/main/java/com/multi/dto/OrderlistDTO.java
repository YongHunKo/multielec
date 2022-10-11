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
	private int orderid;
	private String custid;
	private int cnt;
	private Date orderdate;
	private int totalprice;

}
