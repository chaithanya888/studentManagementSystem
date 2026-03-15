package com.interfacses;



public interface NumberChecker {

	public boolean checkNumber(int num);
	
	public static void main(String[] args) {
		
		NumberChecker obj=new NumberChecker() {
			public boolean checkNumber(int num) {
				if (num <= 1) {
					return false;
				}
				if (num == 2) {
					return true;
				}
				if (num % 2 == 0) {
					return false;
				}
				
				
				for (int i = 3; i * i <= num; i += 2) {
					if (num % i == 0) {
						return false;
					}
				}
				return true;
				
			}
		};
		System.out.println( "is prime :"+obj.checkNumber(6));
		System.out.println( "is prime :"+obj.checkNumber(6));
	}
	
}
