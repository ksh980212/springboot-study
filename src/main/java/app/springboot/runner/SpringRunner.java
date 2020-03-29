package app.springboot.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * Spring Arguments * VM options
 *
 * java -jar *.jar -Dfoo --bar
 *
 * Edit Configuration ->
 * VM options : -Dfoo
 * Program arguments : --bar
 */

@Component
public class SpringRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("foo: " + args.containsOption("foo"));
		System.out.println("bar: " + args.containsOption("bar"));
	}

}
