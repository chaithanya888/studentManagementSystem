package Array;
import java.util.*;
public class Search {

	
	public static void main (String[]args)
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of Elements: ");
		int size=scan.nextInt();
		scan.nextLine();
		int []arr=new int [size];
		System.out.println("Enter "+size+" Elements :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
			
		}
		System.out.println("Enter an element to Search: ");
		int findEle=scan.nextInt();
		scan.nextLine();
		for(int j=0;j<arr.length;j++) {
			
			if(arr[j]==findEle) {
				System.out.println("Element found at position: "+arr[j]);
				scan.close();
				break;
      		}
		}

	}
	}


