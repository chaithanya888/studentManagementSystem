package Array;
import java.util.*;

public class Sum {

	public static void main(String[] args) {
		
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter the number of Elements: ");
     int size=scan.nextInt();
     scan.nextLine();
     int [] arr=new int[size];
     int sum=0;
     
   
     if(size<=0) {
    	 System.out.println("Enter a vaild Number! ");
     }else {
    	 for(int i=0;i<size;i++) {
    		 System.out.println("Enter an element : ");
    		 int ele=scan.nextInt();
    		 scan.nextLine();
    		 arr[i]=ele;
    		 sum+=ele;
    		 
    	 }
    	 scan.close();
    	 System.out.println(Arrays.toString(arr));
    	 System.out.println("Sum of Array is : "+sum);
   }
     
     
	}

}
