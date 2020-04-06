package app.springboot.sample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class SampleControllerTest {

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Test
	public void hello() throws Exception {
		String result = testRestTemplate.getForObject("/hello", String.class);
		assertThat(result).isEqualTo("hello seungho");
	}

	/**
	 * 이 상황에서는 테스트가 서비스 단까지 가게된다.
	 */
}
