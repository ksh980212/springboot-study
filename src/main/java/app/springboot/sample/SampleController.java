package app.springboot.sample;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class SampleController {

	private final SampleService sampleService;
	private Logger logger = LoggerFactory.getLogger(SampleController.class);

	@GetMapping("/hello")
	public String hello() {
		logger.info("will");
		logger.info("skip");
		return "hello " + sampleService.getName();
	}

}
