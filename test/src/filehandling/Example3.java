package filehandling;
import java.io.*;
import java.util.Scanner;
public class Example3 {
	
	

	public static void main(String[] args) throws Exception{
		
		Scanner sc=new Scanner(System.in);
		boolean status=true;
		int option = 0;
		while(status) {
			System.out.println("---------Welcome to 77r and 79r Bank---------");
			System.out.println("1.Login"
					+ "\n2.Register."
					+ "\n3.Exit."
					+ "\nChose an option in [1-3] :");
			option=sc.nextInt();
			sc.nextLine();
			
		
		if(option==1) {
			String userinfo="";
			
			System.out.println("Username :");
			userinfo=sc.nextLine();
			System.out.println("Password :");
			userinfo+=sc.nextLine();
			
			FileInputStream fis=new FileInputStream("C:\\Users\\koppa\\OneDrive\\Documents\\user.txt");
			byte[] data=fis.readAllBytes();
			String info = new String(data);
			String [] users=info.split("\n");
			boolean found=false;
			int i=0;
			while(i<users.length) {
				
				if(users[i].trim().equals(userinfo)) {
				found=true;
				break;
				}else {
					i++;
				}
				
			}
			
			if(found) {
				System.out.println("Login Succesfulled!");
			}else {
				System.out.println("Invalid Data!, try again.");
			}
			fis.close();
			 
			
		}else if(option==2) {
			System.out.println("Enter the Username :");
			String name=sc.nextLine();
			System.out.println("Enter the Password :");
			String password=sc.nextLine();
			
			FileOutputStream fos=new FileOutputStream("C:\\Users\\koppa\\OneDrive\\Documents\\user.txt",true);
			byte [] Name=name.getBytes();
			byte [] Password=password.getBytes();
			
			fos.write(Name);
			fos.write(Password);
			fos.write("\n".getBytes());
			
			System.out.println("Registration is successful.");
			fos.close();
			
			
		}else if(option==3) {
			status=false;
			System.out.println("Bye bye....");
			System.exit(0);
		}else {
			System.out.println("Please choose in 1 to 3 options Only.");
			
			
			
			
		}}
		
		
        sc.close();
	}

}
