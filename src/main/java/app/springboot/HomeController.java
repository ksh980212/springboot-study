package app.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	/**
	 * Spring Security 설정으로 인해
	 * 모든 요청이 인증이 필요하게 됨.
	 * Basic Authentication (Accept Header에 따라 다름)
	 * Basic Authentication form
	 */

	@GetMapping("/my")
	public String my() {
		return "my";
	}

}
