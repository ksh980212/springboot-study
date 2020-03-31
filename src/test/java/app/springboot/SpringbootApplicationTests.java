package app.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;

import static org.assertj.core.api.Assertions.assertThat;

//@TestPropertySource(properties = {"seungho.name=hoho", "seungho.age=23"})
@TestPropertySource(locations = "classpath:/test.properties")
@SpringBootTest
class SpringbootApplicationTests {

	@Autowired
	private Environment environment;

	@Test
	void contextLoads() {
//		assertThat(environment.getProperty("seungho.name"))
////				.isEqualTo("seungho");
//		assertThat(environment.getProperty("seungho.name"))
//				.isEqualTo("hoho");
		assertThat(environment.getProperty("seungho.name"))
				.isEqualTo("good");
	}

}
