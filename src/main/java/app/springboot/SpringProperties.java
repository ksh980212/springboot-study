package app.springboot;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Setter Getter 필요
 */
@Getter
@Setter
@Component
@ConfigurationProperties("seungho") // seungho.* properties load
/**
 * seungho.* properties load
 *
 * @Value("${...}) 보다 TypeSafe함으로 Better
 */
//@EnableConfigurationProperties(SpringProperties.class) => @SpringBootApplication에 포함되어 있어서 @Component만 정의해도 빈으로 등록됨
public class SpringProperties {

	private String name;

	private int age;

	private String fullName;

}
