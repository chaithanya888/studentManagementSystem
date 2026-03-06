package com.cart.system;

public class CartItem {

	int itemId;
	String itemName;
	double []arr=new double[3];
	public CartItem(int itemId, String itemName, double[] arr) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.arr = arr;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double[] getArr() {
		return arr;
	}
	public void setArr(double[] arr) {
		this.arr = arr;
	}
	public double lowestPrice() {
		double lowPrice=arr[0];
		for(double price :arr) {
			if(price<lowPrice) {
				lowPrice=price;
			}
		}
		return lowPrice;
	}
}
