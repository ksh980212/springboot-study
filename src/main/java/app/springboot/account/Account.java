package app.springboot.account;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Setter
@Getter
@Entity
public class Account {

	@Id
	@GeneratedValue
	private Long id;

	private String username;

	private String password;

}
