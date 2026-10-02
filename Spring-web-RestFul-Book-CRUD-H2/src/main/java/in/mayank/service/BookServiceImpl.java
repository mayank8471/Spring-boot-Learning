package in.mayank.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.mayank.model.Book;
import in.mayank.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	private BookRepository repository;

	public BookServiceImpl(BookRepository repository) {
		this.repository = repository;
	}

	@Override
	public String upsertBook(Book book) {
		Integer id = book.getBookId();
		repository.save(book);

		if (id == null) {
			return "Record Inserted";
		} else {
			return "Record Updated";
		}
	}

	@Override
	public List<Book> getAllBooks() {
		List<Book> books = repository.findAll();
		return books;
	}

	@Override
	public String deleteBook(Integer bookId) {
		repository.deleteById(bookId);
		return "Record Deleted";
	}

}
