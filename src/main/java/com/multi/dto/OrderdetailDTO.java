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
    private int orderdetailno;
    private int orderid;
    private int itemid;
    private String orderitem;
    private String shipsearch;
    private int itemprice;
    private int itemcnt;

}
