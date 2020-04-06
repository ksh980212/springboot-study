package app.springboot.sample;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class SampleController {

	private final SampleService sampleService;

	@GetMapping("/hello")
	public String hello() {
		return "hello " + sampleService.getName();
	}

}
