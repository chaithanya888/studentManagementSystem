package filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example1 {
	
	public static void  addData(String location) throws IOException{
		
			FileOutputStream fos=new FileOutputStream(location,true);
			
			String line="Hello, How are you";
			
			byte[] bytes=line.getBytes();
			
			fos.write(bytes);
			fos.close();
			System.out.println("Add data Succesfully.");
		
		
	}

	public static void main(String[] args) throws IOException {
		
       String location="C:\\Users\\koppa\\OneDrive\\Desktop\\Greeting.txt";
		
       File f=new File(location);
       if(f.exists()) {
    	   Example1.addData(location);
       }else {
    	   System.out.println("File not created");
    	   
		   boolean newFile= f.createNewFile();
		   
		   if(newFile) {
			   System.out.println("created the file");
			   Example1.addData(location);
		   }
		   
       }
		
	}

}
