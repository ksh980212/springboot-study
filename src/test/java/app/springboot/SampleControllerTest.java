package app.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(SampleController.class)
class SampleControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void hello() throws Exception {
		mockMvc.perform(get("/hello"))
				.andExpect(status().isOk())
				.andDo(print())
				.andExpect(view().name("hello"))
				.andExpect(model().attribute("name", is("seungho")))
				.andExpect(content().string(containsString("seungho")));
	}

}