package com.ojm18.Collection;
import java.util.*;
public class SetDemo {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add("java");
		hs.add("c");
		hs.add("cpp");
		hs.add("android");
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("java");
		lhs.add("c");
		lhs.add("cpp");
		lhs.add("android");
		
		TreeSet ths = new TreeSet();
		ths.add("java");
		ths.add("c");
		ths.add("cpp");
		ths.add("android");
		
		System.out.println("iterating from hs");
		for(Object ele : hs){System.out.println(ele);}
		System.out.println();
		System.out.println();
		System.out.println("iterating from lhs");
		for(Object ele : lhs){System.out.println(ele);}
		System.out.println();
		System.out.println();
		System.out.println("iterating from ths");
		for(Object ele : ths){System.out.println(ele);}
		
	}

}
