package app.springboot;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;

@Setter
@Getter
@Component
@Validated
@ConfigurationProperties("seungho")
public class SpringProperties {

	@NotEmpty
	private String name;

	private int age;

}
