package com.ojm18.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingDemo {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("D:forjava.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("hello");
			bw.flush();
			bw.close();
			System.out.println("done!!!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
