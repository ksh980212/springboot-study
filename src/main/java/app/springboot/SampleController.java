package app.springboot;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping("/hello")
	public String hello() {
		throw new SampleException();
	}

	@ExceptionHandler(SampleException.class)
	public AppError sampleError(SampleException e) {
		return new AppError("Error Message", "Error Reason");
	}

}
