package com.oops;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Java Program on Serialization and De-Serialization

public class Person implements Serializable {
	int id;
	String name;
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Person p=new Person();
		p.id=100;
		p.name="neha";
		System.out.println("=========Serialization started=====");
		//FileInputsStreams and FileOutPutStram;
		//ObjectOutputStream
		FileOutputStream fos= new FileOutputStream("person.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(p);
		oos.flush();
		oos.close();
		System.out.println("Serialization Process Completed.....");
		System.out.println("=================\n");
		System.out.println("=======De-serialization Started========");
		//FileInputStream class
		//ObjectInputStream
		FileInputStream fis=new FileInputStream("person.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Object object=ois.readObject();
		Person p1=(Person) object;
		System.out.println("Id:"+p1.id);
		System.out.println("Name:"+p1.name);
		ois.close();
		System.out.println("Deserialization Process Completed");
	}

}
