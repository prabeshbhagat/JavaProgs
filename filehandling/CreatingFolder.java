package com.ojm18.filehandling;

import java.io.File;

public class CreatingFolder {

	public static void main(String[] args) {
		File f = new File("D:testfolder");
		if(f.exists()){
			System.out.println("exist..");
		}else {
			f.mkdir();
			System.out.println("folder created");
		}
		
	}

}
