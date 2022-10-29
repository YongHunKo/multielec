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

	private Integer totalprice;


//	public int getCartid() {
//		return cartid;
//	}
//
//	public void setCartid(int cartid) {
//		this.cartid = cartid;
//	}
//
//	public String getCustid() {
//		return custid;
//	}
//
//	public void setCustid(String custid) {
//		this.custid = custid;
//	}
//
//	public int getItemid() {
//		return itemid;
//	}
//
//	public void setItemid(int itemid) {
//		this.itemid = itemid;
//	}
//
//	public int getCnt() {
//		return cnt;
//	}
//
//	public void setCnt(int cnt) {
//		this.cnt = cnt;
//	}
//
//	public String getItemname() {
//		return itemname;
//	}
//
//	public void setItemname(String itemname) {
//		this.itemname = itemname;
//	}
//
//	public int getPrice() {
//		return price;
//	}
//
//	public void setPrice(int price) {
//		this.price = price;
//	}
//
//	public int getTotalprice() {
//		return totalprice;
//	}


	public void initSaleTotal() {

		this.totalprice = this.price * this.cnt;

	}

	@Override
	public String toString() {
		return "CartDTO [cartid=" + cartid + ", custid=" + custid + ", itemid=" + itemid + ", cnt=" + cnt
				+ ", itemname=" + itemname + ", price=" + price + ", img=" + img +", totalprice=" + totalprice + "]";
	}

}