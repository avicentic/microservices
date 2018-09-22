package rs.avicentic.restfullwebservices.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -1157792105257249747L;

	public UserNotFoundException(String message) {
		super(message);
	}

}
