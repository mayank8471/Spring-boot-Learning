package in.mayank.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.mayank.model.Book;

@Service
public interface BookService {

	
	public String upsertBook(Book book);
	
	public List<Book>  getAllBooks();
	
	public String deleteBook(Integer bookId);
	
}
