package app.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	/**
	 * WebMvcConfigurer의 addResourceHandlers로 커스터마이징 할 수 있다.
	 * 캐싱 전략을 따로 설정해주어야 한다. setCachedPeriod(20)
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/m/**")
				.addResourceLocations("classpath:/m/")
				.setCachePeriod(20);
	}

	/**
	 * Web JAR
	 * jquery, react, view, angular등 JAR파일로 추가할 수 있다.
	 */
}