package com.ojm18.Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();  
		  
		  hm.put(100,"Amit");  
		  hm.put(101,"Vijay");  
		  hm.put(102,"Rahul");  
		  
		  for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }
	}

}
