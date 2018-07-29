package com.ojm18.filehandling;

import java.io.File;
import java.io.IOException;

public class CreatingFile {

	public static void main(String[] args) {
		File f = new File("D:testfile.txt");
		if(f.exists()){
			System.out.println("exist..");
		}else {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("file created");
		}
	}

}
