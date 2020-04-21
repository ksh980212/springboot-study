package app.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class RestRunner implements ApplicationRunner {

	@Autowired
	private WebClient.Builder builder;

	@Autowired
	private RestTemplateBuilder restTemplateBuilder;

	private WebClient webClient;

	public RestRunner(WebClient.Builder build) {
		this.webClient = build.build();
	}

	/**
	 * WebClient: Non-Blocking I/O 기반의 Asynchronous API
	 */
	@Override
	public void run(ApplicationArguments args) throws Exception {
		WebClient webClient = builder
				.baseUrl("http://localhost:8080")
				.build();

		StopWatch stopWatch = new StopWatch();
		stopWatch.start();

		// hello
		Mono<String> helloMono = webClient.get().uri("/hello")
				.retrieve()
				.bodyToMono(String.class);

		helloMono.subscribe(s -> {
			System.out.println(s);
			if (stopWatch.isRunning()) {
				stopWatch.stop();
			}
			System.out.println(stopWatch.prettyPrint());
		});

		// world
		Mono<String> worldMono = webClient.get().uri("/world")
				.retrieve()
				.bodyToMono(String.class);
		worldMono.subscribe(s -> {
			System.out.println(s);
			if (stopWatch.isRunning()) {
				stopWatch.stop();
			}
			System.out.println(stopWatch.prettyPrint());
		});
		System.out.println(stopWatch.prettyPrint());
	}

}
