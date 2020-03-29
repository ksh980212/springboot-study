package app.springboot.listener;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

/**
 * ApplicationContext가 생성되기 전에 발생하는 Event
 */
public class SampleStartingListener implements ApplicationListener<ApplicationStartingEvent> {

	@Override
	public void onApplicationEvent(ApplicationStartingEvent event) {
		System.out.println("=======================");
		System.out.println("Application is starting");
		System.out.println("=======================");
	}

}
