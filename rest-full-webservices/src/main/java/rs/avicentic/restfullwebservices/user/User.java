package rs.avicentic.restfullwebservices.user;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class User {

	private Integer id;

	@Size(min = 2, message = "Name should hve at least 2 characters")
	private String name;

	@Past
	private Date birthDate;

	protected User() {
		super();
	}

}
