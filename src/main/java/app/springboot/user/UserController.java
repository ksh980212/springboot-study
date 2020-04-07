package app.springboot.user;

import org.springframework.web.bind.annotation.*;

/*
	org.spring.framework.boot:spring-boot-autoconfigure:2.2.6.RELEASE 이라는 모듈의
	META_INF/spring.factories
    org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration,\ class
    로 인해 Spring-boot에서 Web-MVC에 따로 설정없이 바로 사용할 수 있음.
 */
@RestController
public class UserController {

	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}

	/**
	 HTTPMessageConverter
	 만약 JSON 요청이면, JsonMessageConverter가 사용됨.
	 만약 User라는 객체를 response할때, 기본적으로 JsonMessageConverter가 사용됨!

	 cf) @RestController가 있으면, @ResponseBody 생략해도 된다!
	 그냥 @Controller일 경우 @ResponseBody를 써줘야 HttpMessageConverter가 작동됨.
	 */
	@PostMapping("/users/create")
	public @ResponseBody
	User create(@RequestBody User user) {
		return user;
	}

}
