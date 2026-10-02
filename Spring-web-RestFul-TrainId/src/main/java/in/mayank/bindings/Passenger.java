package in.mayank.bindings;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JacksonXmlRootElement
public class Passenger {

	private Long pId;
	private String name;
	private String trainName;
	private Integer trainNumber;
	private String source;
	private String destination;
	
}
