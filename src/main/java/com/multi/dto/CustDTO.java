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
public class CustDTO {
	private String custid;
	private String custpwd;
	private String custname;
	// 필수입력데이터 고객id, pwd, 이름
	private String gender;
	private Integer age;
	private Date custrdate;
	private String birth;
	private String tel;
	private String addr;

}
