package app.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  Static Reources Mapping
 *  기본 Resource 위치
 *  classpath:/static
 *  classpath:/public
 *  classpath:/resoruces/
 *  classpath:/META-INF/resources
 */

/**
 * HTTP STATUS CODE 304 vs 200
 * Last-Modified 헤더를 보고 304 응답을 보냄.
 */

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

}