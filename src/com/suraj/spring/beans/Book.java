package com.suraj.spring.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Book {

	private Integer bookId;
	private String bookName;
	
	public Integer getBookId() {
		return bookId;
	}
	
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@PostConstruct
	public void init() throws Exception {
		System.out.println("Before book issued get authrized by Librarian...");
	}
	
	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("book deposited to Library after reading the book...");
	}

	
	
}
