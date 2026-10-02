package in.mayank.bindings;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@XmlRootElement
@AllArgsConstructor
public class Book {
	
	private Integer bookId;
	private String bookName;
	private String authorName;
}
