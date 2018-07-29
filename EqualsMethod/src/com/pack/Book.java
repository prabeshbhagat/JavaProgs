package com.pack;

public class Book {
	
	String title;
	int page;
	
	public Book(String title, int page) {
		super();
		this.title = title;
		this.page = page;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Book bk = (Book) obj;
		return page == bk.page && title.equals(bk.title) ;
	}
	
	@Override
	public String toString() {
		return "title : "+title + " , page : "+page; 
	}
	
}
