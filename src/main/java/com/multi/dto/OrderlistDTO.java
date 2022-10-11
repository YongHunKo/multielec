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

}
