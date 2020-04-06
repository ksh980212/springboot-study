package app.springboot.sample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class SampleControllerTest {

	@Autowired
	private TestRestTemplate testRestTemplate;

	@MockBean
	private SampleService mockSampleService;

	@Test
	public void hello() throws Exception {
		when(mockSampleService.getName()).thenReturn("whiteship");

		String result = testRestTemplate.getForObject("/hello", String.class);
		assertThat(result).isEqualTo("hello whiteship");
	}

	/**
	 * 컨트롤러만 분리해서 테스트하고 싶다 => MockBean
	 */
}
