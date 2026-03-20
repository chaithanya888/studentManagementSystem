package Exception2;
import java.util.Scanner;

class CarStopped extends Exception{
	public CarStopped(String message) {
		super(message);
	}
}
class CarPuncture extends Exception{
	public CarPuncture(String message) {
		super(message);
	}
}
class CarHeat extends Exception{
	public CarHeat(String message) {
		super(message);
	}
}





public class Example1 {
	
	public static void Stop(String msg) throws CarStopped{
		
			if(msg.equalsIgnoreCase("stop")) {
				throw new CarStopped("CarStopped: Car is stopped");
			}else {
				System.out.println("Car not Stalled.");
			}
		
	}
	
	
	public static void puncture(String msg) throws CarPuncture {
		
			if(msg.equalsIgnoreCase("puncture")) {
				throw new CarPuncture("Car Punctured: Car is Punctured");
			}else {
				System.out.println("car is not punctured");
			}
		
		}
	
	public static void carHeat(int deg) throws CarHeat{
		
			if(deg>50) {
				throw new CarHeat("Car Heated: Car is Heated more than 50 degree");
			}else {
				System.out.println("Car not Stalled");
			}
	}
			
			
public static void main(String[]args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the Car Move :");
				String carMove=sc.nextLine();
				System.out.println("Enter the tyre Condition :");
				String carTyre=sc.nextLine();
				System.out.println("Enter the Car Temperature :");
				int carTemp=sc.nextInt();
				
				
				
		try {
			Stop(carMove);
		} catch (CarStopped e) {
			System.out.println(e.getMessage());
	}
		
	try {
		puncture(carTyre);
	} catch (CarPuncture e) {
		System.out.println(e.getMessage());
		}
		
		try {
			carHeat(carTemp);
		} catch (CarHeat e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	
	
}}


	
	

