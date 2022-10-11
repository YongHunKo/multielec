package com.multi.dto;

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
public class ShipDTO {
	
	private Integer shipid;
	private Integer orderid;
	private String shipname;
	private String shipaddr;
	private String shiptel;

}
