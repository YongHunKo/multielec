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
public class OrderdetailDTO {
    private Integer orderdetailno;
    private Integer orderid;
    private Integer itemid;
    private String orderitem;
    private String shipsearch;
    private Integer itemprice;
    private Integer itemcnt;

}
