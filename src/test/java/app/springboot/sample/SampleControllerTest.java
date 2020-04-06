package app.springboot.sample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class SampleControllerTest {

	@Autowired
	private WebTestClient webTestClient; // 비동기로 동작됨.

	@MockBean
	private SampleService mockSampleService;

	@Test
	public void hello() throws Exception {
		when(mockSampleService.getName()).thenReturn("whiteship");

		webTestClient.get().uri("/hello").exchange()
				.expectStatus().isOk()
				.expectBody(String.class).isEqualTo("hello whiteship");
	}

}
