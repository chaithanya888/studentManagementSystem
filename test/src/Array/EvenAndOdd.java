package Array;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOdd {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
	     System.out.println("Enter the number of Elements: ");
	     int size=scan.nextInt();
	     scan.nextLine();
	     int [] arr=new int[size];
	     int evenCount=0;
	     int oddCount=0;
	     
		 if(size<=0) {
	    	 System.out.println("Enter a vaild Number! ");
	     }else {
	    	 for(int i=0;i<size;i++) {
	    		 System.out.println("Enter an element : ");
	    		 int ele=scan.nextInt();
	    		 scan.nextLine();
	    		 arr[i]=ele;
	    		 
	    		 if(ele%2==0) {
	    			 evenCount++;
	    		 }else {
	    			 oddCount++;
	    		 }
	    	 }
	    	 scan.close();
	    	 System.out.println(Arrays.toString(arr));
	    	 System.out.println("Event number in Array : "+evenCount);
	    	 System.out.println("Odd count in Arrays : "+oddCount);
	   }

	}

}
