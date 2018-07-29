package com.ojm18.objectClass;

public class Book {
		String name;
		int page;
	Book(String name,int page)
	{
		this.name = name;
		this.page=page;
	}
	
	public String toString(){
		return "["+name+","+page+"]";
	}
 
}