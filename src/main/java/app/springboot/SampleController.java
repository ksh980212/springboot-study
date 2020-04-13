package app.springboot;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	/**
	 * 특정 Method CORS 설정
	 */
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}

}
