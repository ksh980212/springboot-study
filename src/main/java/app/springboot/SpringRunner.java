package app.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SpringRunner implements ApplicationRunner {

	private Logger logger = LoggerFactory.getLogger(SpringRunner.class);

	@Override
	public void run(ApplicationArguments args) throws Exception {
		logger.debug("================");
		logger.debug("This is Spring Boot App");
		logger.debug("================"); //--debug or loggin.level = debug 설정해야함
	}

}
