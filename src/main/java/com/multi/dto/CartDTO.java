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

//	
//	public int getCartId() {
//		return cartid;
//	}
//
//	public void setCartId(int cartid) {
//		this.cartid = cartid;
//	}
//
//	public String getCustId() {
//		return custid;
//	}
//
//	public void setCustId(String custid) {
//		this.custid = custid;
//	}
//
//	public int getItemId() {
//		return itemid;
//	}
//
//	public void setItemId(int itemid) {
//		this.itemid = itemid;
//	}
//
//	public int getCnt() {
//		return cnt;
//	}
//
//	public void setCnt(int cnt) {
//		this.cnt =cnt;
//	}
//
//	public String getItemName() {
//		return itemname;
//	}
//
//	public void setItemName(String itemname) {
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
//	public int getTotalPrice() {
//		return totalprice;
//	}	

	public void initSaleTotal() {
		
		this.totalprice = this.price*this.cnt;
				
	}

	@Override
	public String toString() {
		return "CartDTO [cartId=" + cartid + ", custId=" + custid + ", ItemId=" + itemid + ", Cnt="
				+ cnt + ", ItemName=" + itemname + ", Price=" + price + ", totalPrice=" + totalprice + "]";
	}
}

