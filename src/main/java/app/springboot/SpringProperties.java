package app.springboot;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

/**
 * Setter Getter 필요
 */
@Getter
@Setter
@Component
@ConfigurationProperties("seungho") // seungho.* properties load
@Validated
/**
 * seungho.* properties load
 *
 * @Value("${...}) 보다 TypeSafe함으로 Better
 */
//@EnableConfigurationProperties(SpringProperties.class) => @SpringBootApplication에 포함되어 있어서 @Component만 정의해도 빈으로 등록됨
public class SpringProperties {

	@NotEmpty
	private String name;

	private int age;

	private String fullName;

	/**
	 * DurationUnit 시간정보를 받아옴
	 */
	@DurationUnit(ChronoUnit.SECONDS) // properties에 25s s를 붙이면 어노테이션 안해줘도됨
	private Duration sessionTimeout = Duration.ofSeconds(30);

}
