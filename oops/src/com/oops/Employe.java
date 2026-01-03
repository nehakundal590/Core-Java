package com.oops;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employe implements Serializable{
	
		private static final long serialVersionUID=1001;
		int id;
		String name;
		String email;
		transient String pwd;
		public static void main(String[] args) throws IOException, ClassNotFoundException {
			Employe e=new Employe();
			e.id=100;
			e.name="Ajay";
			e.email="Ajay@gmail.com";
			e.pwd="aja1234";
			System.out.println("======Serialization Starter===n");
			FileOutputStream fos=new FileOutputStream("employee.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(e);
			oos.flush();
			oos.close();
			System.out.println("=====serialization Completed==\n");
			System.out.println("=====De-Serialization Started==");
			FileInputStream fis=new FileInputStream("employee.ser");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Object Object =ois.readObject();
			Employe e1=(Employe) Object;
			System.out.println("Id"+e1.name);
			System.out.println("Name"+e1.name);
			System.out.println("email"+e1.email);
			System.out.println("Passwoed"+e1.pwd);
			ois.close();
			System.out.println("Deserialization completed");
			
		}
	}


