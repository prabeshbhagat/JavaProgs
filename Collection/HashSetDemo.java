package com.ojm18.Collection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {

		int [] a = {10,12,14,10,12,18,22,4};
		HashSet hs = new HashSet();
		for(int  i : a){
			hs.add(i);
		}
		for (Object i : hs){
			System.out.println(i);//unique values only
		}
	}

}
