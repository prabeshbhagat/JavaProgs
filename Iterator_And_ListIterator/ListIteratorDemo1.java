package com.ojm18.Iterator_And_ListIterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo1 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(15);
		al.add(25);
		ListIterator ltr = al.listIterator();
		while(ltr.hasNext()){
			System.out.println(ltr.next());
		}

		System.out.println();
		System.out.println();
		while(ltr.hasPrevious()){
			System.out.println(ltr.previous());
		}
		
	}

}
