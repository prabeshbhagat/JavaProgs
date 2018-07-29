package com.ojm18.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		Student std = new Student("ram", 15);
		try {
			FileOutputStream fos = new FileOutputStream("D:ser.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(std);
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("done !!!");
	}

}
