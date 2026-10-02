package in.mayank.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Book_DTLS")
@Data
public class Book {
	
	@Column(name = "Book_id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bookId;
	
	@Column(name = "Book_Name")
	private String bookName;
	
	@Column(name = "Book_Price")
	private Double bookPrice;
}
