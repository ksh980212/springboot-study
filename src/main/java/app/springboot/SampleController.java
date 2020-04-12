package app.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * View를 반환하는 Controller
 */
@Controller
public class SampleController {

	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("name", "seungho");
		return "hello";
	}

}
