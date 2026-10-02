package com.mayank.convertor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mayank.bindings.Book;

public class JSONToJava {
	public static void main(String[] args) throws StreamReadException, DatabindException, FileNotFoundException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		
		Book b1  =mapper.readValue(new FileReader(new File("book.json")), Book.class);
		System.out.println(b1);
	}

}
