package com.ojm18.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationDemo {

	public static void main(String[] args) {

		Student s1 = null;
		try {
			FileInputStream fis = new FileInputStream("D:ser.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			s1 = (Student) ois.readObject();
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(s1);

	}

}
