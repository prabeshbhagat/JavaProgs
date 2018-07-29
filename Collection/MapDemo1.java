package com.ojm18.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo1 {

	public static void main(String[] args) {
		
		Map map = new HashMap();
		
		map.put("s1", 10);
		map.put("s2", 15);
		map.put("s3", 20);
		map.put("s4",25);
		
		
		System.out.println(map);
		
		Iterator itr = map.keySet().iterator();
		while(itr.hasNext()){
			Object key = itr.next();
			Object value = map.get(key);
			System.out.println(key+" = "+value);
		}
		
		Map map1 = new LinkedHashMap();//insertion order is preserved..
		
		map1.put("s1", 150);
		map1.put("s2", 15);
		map1.put("s3", 20);
		map1.put("s4",25);
		
		System.out.println(map1);
		
		Iterator itr1 = map1.keySet().iterator();
		while(itr1.hasNext()){
			Object key = itr1.next();
			Object value = map1.get(key);
			System.out.println(key+" = "+value);
		}
	}

}
