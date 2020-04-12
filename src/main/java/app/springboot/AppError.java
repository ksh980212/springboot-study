package app.springboot;

import lombok.Getter;

@Getter
public class AppError {

	private String message;

	private String reason;

	public AppError(String message, String reason) {
		this.message = message;
		this.reason = reason;
	}

}
