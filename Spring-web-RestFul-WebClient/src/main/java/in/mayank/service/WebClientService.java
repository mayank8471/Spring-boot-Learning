package in.mayank.service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;



@Service
public class WebClientService {

	@Value("${Rest.apiUrl}")
	private String apiUrl;
	
	public String invokeGetMSG() {
		WebClient client = WebClient.create();
		
		
		
		String string = client.get()
				.uri(apiUrl)
				.retrieve()
				.bodyToMono(String.class)
				.block();
		return string;
		
	}
}
