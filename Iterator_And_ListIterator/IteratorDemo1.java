package com.ojm18.Iterator_And_ListIterator;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorDemo1 {

	public static void main(String[] args) {
		
		HashSet hs =new HashSet();
		hs.add("java");
		hs.add("c");
		hs.add("cpp");
		hs.add("android");
		
		Iterator itr = hs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			itr.remove();
		}
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
