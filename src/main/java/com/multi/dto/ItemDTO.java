package com.multi.dto;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

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
public class ItemDTO {
    private Integer itemid;
    private Integer cateid;
    private String itemname;
    private Integer price;
    private String img;
    private Integer likecnt;
    private Date itemrdate;
    
    private MultipartFile img2;

}