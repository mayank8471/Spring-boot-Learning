package com.mayank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.mayank.binding.Book;

@Controller
public class BookController {

	@GetMapping("/")
	public String displayForm(Model model) {
		Book b1 = new Book();

		model.addAttribute("book", b1);
		return "index";
	}

	@PostMapping("/book")
	public String saveBook(Book book, Model model) {

		System.out.println(book);

		model.addAttribute("msg", "Book save succesFully");

		return "success";
	}
}
