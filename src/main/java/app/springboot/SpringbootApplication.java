package app.springboot;

import app.springboot.listener.SampleStartingListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Application Context가 만들어진 이후에 발생하는 이벤트들은
 * Bean을 실행할수 있음. (ApplicationStartedEvent)
 * <p>
 * But
 * Application Context 이전에 발생하는 이벤트들은
 * Bean을 실행할 수 없다. (ApplicationStartingEvent)
 */

/**
 *  순서
 *  ApplicationStartingEvent -> ApplicationContext -> ApplicationStartedEvent
 */

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringbootApplication.class);
		app.setWebApplicationType(WebApplicationType.NONE); // REACTIVE, NONE, SERVLET
		app.addListeners(new SampleStartingListener());
		app.run(args);
	}

}


