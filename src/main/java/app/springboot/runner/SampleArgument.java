package app.springboot.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

/**
 * Spring Arguments * VM options
 *
 * java -jar *.jar -Dfoo --bar
 *
 * or
 *
 * Edit Configuration ->
 * VM options : -Dfoo
 * Program arguments : --bar
 */

@Component
public class SampleArgument {

	public SampleArgument(ApplicationArguments arguments) {
		System.out.println("foo: " + arguments.containsOption("foo")); // false
		System.out.println("bar: " + arguments.containsOption("bar")); // true
	}

}
