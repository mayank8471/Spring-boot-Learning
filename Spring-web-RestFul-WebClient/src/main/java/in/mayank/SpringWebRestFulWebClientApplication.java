package in.mayank;

import in.mayank.service.WebClientService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringWebRestFulWebClientApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringWebRestFulWebClientApplication.class, args);
		
		WebClientService bean = context.getBean(WebClientService.class);
		
		System.out.println(bean.invokeGetMSG());
	}

}
