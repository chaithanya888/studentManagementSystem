package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	     System.out.println("Enter the number of Elements: ");
	     int size=scan.nextInt();
	     scan.nextLine();
	     int [] arr=new int[size];
	     
	     
		 if(size<=0) {
	    	 System.out.println("Enter a vaild Number! ");
	     }else {
	    	 for(int i=0;i<size;i++) {
	    		 System.out.println("Enter an element : ");
	    		 int ele=scan.nextInt();
	    		 scan.nextLine();
	    		 arr[i]=ele;
	      }
	    	 System.out.println(Arrays.toString(arr));
	    	 int k=arr.length;
	    	 for (int j= 0; j< k / 2; j++) {
	    		 int temp = arr[j];
	    		 arr[j] = arr[k - 1 - j];
	    		 arr[k - 1 - j] = temp;
    	 }
	      
          scan.close();
          System.out.println(Arrays.toString(arr));
	     }
	}

}
