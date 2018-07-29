package com.abc;

public class Book {
	String title;
	int page;

	public Book(String title, int page) {
		this.title = title;
		this.page = page;
	}
	
	@Override
	public String toString() {
		return "title :"+title+" and pages : "+page;
	}
	
}
