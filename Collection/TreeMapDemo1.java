package com.ojm18.Collection;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo1 {

	public static void main(String[] args) {
		TreeMap<Integer,String> hm=new TreeMap<Integer,String>();  
		  
		  hm.put(100,"Amit");  
		  hm.put(102,"Ravi");  
		  hm.put(101,"Vijay");  
		  hm.put(103,"Rahul");  
		  
		  for(Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  } 
	}

}
