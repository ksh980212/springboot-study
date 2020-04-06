package app.springboot.sample;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(OutputCaptureExtension.class)
@WebMvcTest(SampleController.class) // Controller와 다른 계층의 의존성 분리
public class SampleControllerTest {

	@MockBean
	private SampleService mockSampleService;

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void hello(CapturedOutput capturedOutput) throws Exception {
		when(mockSampleService.getName()).thenReturn("whiteship");

		mockMvc.perform(get("/hello"))
				.andExpect(status().isOk())
				.andExpect(content().string("hello whiteship"));

		assertThat(capturedOutput.toString())
				.contains("will")
				.contains("skip");
	}

}
