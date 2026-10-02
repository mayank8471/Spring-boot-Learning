package in.mayank.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.mayank.model.Book;

public interface BookRepository  extends JpaRepository<Book, Serializable>   {

}
