package com.cart.system;

public class ShoppingCart {
	private CartItem []cartItem=new CartItem[5];

	public ShoppingCart(CartItem[] Cartitem) {
		
		cartItem = Cartitem;
	}
	
	public CartItem[] getCartItem() {
		return cartItem;
	}

	public void setCartItem(CartItem[] cartItem) {
		this.cartItem = cartItem;
	}




	public void displayCart() {
		for(CartItem item:cartItem) {
			System.out.println(item.itemName+"||"+item.lowestPrice());
		}
	}
	
	public void caluclateTotalCost() {
		double totalcost=0.0;
		for(CartItem items:cartItem) {
			totalcost+=items.lowestPrice();
		}
		System.out.println(totalcost);
	}
	
	
	
	
	
public static void main (String[]args) {
     
	CartItem[] items= {
			new CartItem(1,"Chips",new double[] {19.9,20.1,18.7}),
			new CartItem(2,"Samosa",new double[] {29.9,24.1,28.7}),
			new CartItem(3,"PopCorn",new double[] {17.9,17.1,18.7}),
			new CartItem(4,"Lassi",new double[] {19.9,20.1,21.7}),
			new CartItem(5,"Jelabi",new double[] {29.9,29.1,30.7})
	};
	
	ShoppingCart cart=new ShoppingCart(items);
	cart.displayCart();
	cart.caluclateTotalCost();
}
}
