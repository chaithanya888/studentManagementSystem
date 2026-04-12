package filehandling;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class Example2 {

	public static void main(String[] args) throws Exception {

		String location="C:\\Users\\koppa\\OneDrive\\Desktop\\output.txt";
		String location2="C:\\Users\\koppa\\OneDrive\\Desktop\\input.txt";
		
		FileInputStream fis=new FileInputStream(location);
		FileOutputStream fos=new  FileOutputStream(location2);
		 
		int data;
		while((data=fis.read())!=-1) {
			fos.write((char)data);
		}
		System.out.println("Copy completed.");
		
		fis.close();
		fos.close();
		
	}

}
