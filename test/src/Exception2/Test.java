package Exception2;
import java.util.Scanner;


class Handle{
	public  static void tieMethod(int num) {
		try {
			System.out.println("10000");
			tilMethod(num);
			System.out.println("Coders");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void tilMethod(int no) {
		try {
			
			if(no==0) {
				throw new ArithmeticException(" ArithmeticException: / by zero");
			}else if(no==10){
				throw new ArithmeticException(" ArithmeticException: / by 10 ");
			}else {
				System.out.println("Completed");
			}
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Finally");
		}
}




}

public class Test {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Divisor :");
		int value=sc.nextInt();
		Handle.tieMethod(value);
		sc.close();
	}
	
}