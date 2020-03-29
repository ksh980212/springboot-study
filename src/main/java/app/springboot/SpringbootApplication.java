package app.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringbootApplication.class);
		app.setWebApplicationType(WebApplicationType.NONE);
		app.run(args);
	}

}
