package app.springboot.listener;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * ApplicaitonContext가 생성된 후 발생하는 Event
 * => Bean 등록만으로도 OK
 */
@Component
public class SampleStartedListener implements ApplicationListener<ApplicationStartedEvent> {

	@Override
	public void onApplicationEvent(ApplicationStartedEvent event) {
		System.out.println("===================");
		System.out.println("Application is Started");
		System.out.println("==================");
	}

}
