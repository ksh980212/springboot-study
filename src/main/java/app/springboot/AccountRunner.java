package app.springboot;

import app.springboot.account.Account;
import app.springboot.account.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AccountRunner implements ApplicationRunner {

	private final AccountService accountService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Account will = accountService.createAccount("seungho", "1234");
		System.out.println(will.getUsername() + " password: " + will.getPassword());
	}

}
