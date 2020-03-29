package app.springboot.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class SpringCommandLineRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("+++++++++++++++++");
		Arrays.stream(args)
				.forEach(System.out::println); // --bar (역시 JVM options는 무시함)
	}

}
