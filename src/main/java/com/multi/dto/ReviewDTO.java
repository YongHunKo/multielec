package com.multi.dto;

import java.util.*;

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
public class ReviewDTO {
		
	private Integer rvid;
	private Integer itemid;
	private String custid;
	private String rvtxt;
	private Date rvdate;
	
	
}
