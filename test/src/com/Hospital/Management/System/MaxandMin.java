package com.Hospital.Management.System;

public class MaxandMin {
int arr[]=new int[] {3,9,2,5,6};

public void minValue() {
	int minValue=arr[0];
	for(int ele:arr) {
		if(ele<minValue) {
			
			minValue=ele;
		}}
	System.out.println("Minimum Value is :"+minValue); 
}

public void maxValue() {
	int maxValue=arr[0];
	for(int ele:arr) {
		if(ele>maxValue) {
			maxValue=ele;
		}
			
	
	}
	System.out.println("Maximum Value is: "+maxValue);
}


	public static void main(String[] args) {
		
		MaxandMin obj=new MaxandMin();
		obj.minValue();
		obj.maxValue();
	}

}
