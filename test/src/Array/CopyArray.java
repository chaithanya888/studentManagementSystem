package Array;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of Elements: ");
		int size=scan.nextInt();
		scan.nextLine();
		int []arr=new int [size];
		int []arr1=new int[arr.length];
		System.out.println("Enter "+size+" Elements :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Arrays One :"+Arrays.toString(arr));
		for(int j=0;j<arr.length;j++) {
			arr1[j]=arr[j];
		}
		System.out.println("");
		System.out.println("Array Two Copy of Array One :"+Arrays.toString(arr1));
        scan.close();
	}

}
