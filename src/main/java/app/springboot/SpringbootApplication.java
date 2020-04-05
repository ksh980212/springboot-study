package app.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * java -jar build/libs/springboot-0.0.1-SNAPSHOT.jar --spring.profiles.active=test
 * 을 통해 Profile 설정을 Command Line 에서 할 수 있다. (우선순위 더 높음)
 * 물론 ./gradlew build 과정이 우선시 되어야한다!
 */

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringbootApplication.class);
		app.setWebApplicationType(WebApplicationType.NONE);
		app.run(args);
	}

}
