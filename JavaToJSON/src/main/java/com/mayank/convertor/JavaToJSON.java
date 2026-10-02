package com.mayank.convertor;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mayank.bindings.Book;

public class JavaToJSON {
	public static void main(String[] args) throws Exception  {
		Book b1 = new Book();
		b1.setBookId(101);
		b1.setBookName("Spring");
		b1.setBookPrice(450.25);
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("book.json"), b1);
		System.out.println("Completed....");
		
	}
}
