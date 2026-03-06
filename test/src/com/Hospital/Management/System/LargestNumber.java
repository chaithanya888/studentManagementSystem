package com.Hospital.Management.System;

public class LargestNumber {

	int arr[]=new int[] {12,35,1,10,34,1};
	int value=arr[0];
	public void Value() {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>value) {
				value=arr[i];
			
		}
		}
		System.out.println(value);
	}
	public static void main(String[] args) {
		LargestNumber obj=new LargestNumber();
		obj.Value();

	}

}
