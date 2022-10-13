package com.multi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CartDTO {
	
	
	private Integer cartid;
	private String custid;
	private Integer itemid;
	private Integer cnt;

	
	private String itemname;
	private Integer price;
	private String img;
}
