package app.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {

	@Autowired
	private SpringProperties springProperties;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("================");
		System.out.println(springProperties.getName());
		System.out.println(springProperties.getAge());
		System.out.println(springProperties.getFullName());
		System.out.println(springProperties.getSessionTimeout());
		System.out.println("================");
	}

}
