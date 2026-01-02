package com.oops;
import java.io.File;
import java.io.IOException;

public class Handling2 {
	public static void main(String[] args) {
		
		/*//------->Create a file
		File f=new File("neha.txt");
		File f2=new File("extension.txt");
		File f3=new File("java.txt");
		File f4=new File("spring.txt");
		File f5=new File("angular.txt");
		try {

			boolean fstatus	=f.createNewFile();
			boolean f2status=f2.createNewFile();
			boolean f3status=f3.createNewFile();
	
	System.out.println(fstatus);
	System.out.println(f2status);
	System.out.println(f3status);
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
	}*/
		
		 /*//------------>create a folder
		File f=new File("my folder");
		boolean fstatus=f.mkdir();
		System.out.println(fstatus);*/
		
		//----------------->Folder files
		File f2=new File("data");
		boolean hh=f2.mkdir();
		File f1=new File(f2,"file.txt");
		try {
			boolean filecreatedOrNot=f1.createNewFile();
			System.out.println(filecreatedOrNot);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}
