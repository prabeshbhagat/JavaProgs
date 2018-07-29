package com.ojm18.filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingDemo {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("D:forjava.txt");
			BufferedReader br = new BufferedReader(fr);
			String s = br.readLine();
			br.close();
			System.out.println(s);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
