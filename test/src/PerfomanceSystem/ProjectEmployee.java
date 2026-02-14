package PerfomanceSystem;
import java.util.*;

public class ProjectEmployee extends Employee {
	String ProjectName;
	String ProjectRole;
	static int []arr=new int[3];
	
	
	public ProjectEmployee( String projectName,String projectRole,String empName, int empId, String empDep) {
		super(empName, empId, empDep);
		this.ProjectName=projectName;
		this.ProjectRole=projectRole;
		
	}
	
	public void Profile2() {
		System.out.println("Project name"+this.ProjectName);
		System.out.println("Project Role"+this.ProjectRole);
		System.out.println("Perfomance"+Arrays.toString(arr));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main (String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Employee Name: ");
		String empName=scan.nextLine();
		System.out.println("Enter the ID: ");
		int empId=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the Employee Deparment :");
		String empDep=scan.nextLine();
		System.out.println("Enter the project Name : ");
		String projectName=scan.nextLine();
		System.out.println("Enter the Project Role :");
		String projectRole=scan.nextLine();
		System.out.println("Enter 3 Months Perfomance Score:");
		
		 for(int i=0;i<3;i++) {
			 System.out.println("Month-"+i);
			 int rate=scan.nextInt();
			 
			 arr[i]=rate;
			 
		 }
			
		
		
		ProjectEmployee obj=new ProjectEmployee(projectName,projectRole,empName,empId,empDep);
		
		
		
		
		
		
		
		boolean status=true;
		while(status) {
			System.out.println("");
			System.out.println("---Menu---");
			System.out.println("1.Update project role");
			System.out.println("2.Update Project Name");
			System.out.println("3.View Employee Perfomance");
			System.out.println("4.View Average Perfomance");
			System.out.println("5.Exit");
			
			int option=scan.nextInt();
			scan.nextLine();
			if(option<=5) {
				if(option==1) {
					
				}else if(option==2){
					
				}else if(option==3) {
					System.out.println("Employee Profile Created");
					obj.Profile1();
					obj.Profile2();
				}else if(option==4) {
					
				}else if(option==5) {
					System.out.println("You Exited the Menu");
					break;
				}
			}else {
				System.out.println("Chocie in 1 to 5");
				scan.close();
			}
		}
		
	}
   
	
}

