package com.ojm18.Generics;

import java.util.HashSet;

public class GenericDemo1 {

	public static void main(String[] args) {
		
		HashSet<String> s = new HashSet<String>();
		s.add("linku");
		s.add("tinku");
		//s.add(15); CE
		s.add("pinku");
		for (String i : s){
			System.out.println(i.length());
		}
	}

}