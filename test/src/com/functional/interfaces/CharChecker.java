package com.functional.interfaces;

public interface CharChecker {
   void checkChar(char a);
	public static void main(String[] args) {
		CharChecker obj=new CharChecker() {
			public void checkChar(char a){
				//char num=a;
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
		obj.checkChar('A');
	}
}
