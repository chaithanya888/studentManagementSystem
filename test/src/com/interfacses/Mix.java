package com.interfacses;
interface Numbercheck {
	boolean NumberChecker(int num);
}
interface Charchecker{
	void charCheck(char a);
	
}

public class Mix {

	 
		public static void main(String[] args) {
			Numbercheck obj=new Numbercheck() {
				public boolean NumberChecker(int num) {
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
			
			System.out.println("Is prime "+obj.NumberChecker(6));
			System.out.println("Is prime "+obj.NumberChecker(45));
			System.out.println("Is prime "+obj.NumberChecker(59));
			System.out.println("-------------------------");
			
			Charchecker obj1=new Charchecker() {
				public void charCheck(char a) {
					int ascii=(int) a;
					if (ascii <= 1) {
	                   System.out.println(ascii+" Not prime");
	                   return;
					}if (ascii == 2) {
						System.out.println(ascii+" Is prime");
						return;
					}
					if (ascii % 2 == 0) {
						System.out.println(ascii+" Not prime");
						return;
					}
					
					
					for (int i = 3; i * i <= ascii; i += 2) {
						if (ascii % i == 0) {
							System.out.println(ascii+" Not prime");
							return;
						}
					
					}
					
						System.out.println(ascii+" Is prime");
				
				
				}
			};
			
			obj1.charCheck('A');
			obj1.charCheck('C');
			obj1.charCheck('R');
			
			
			
		}
}



















