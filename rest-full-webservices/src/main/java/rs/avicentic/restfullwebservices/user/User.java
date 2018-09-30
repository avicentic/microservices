package rs.avicentic.restfullwebservices.user;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@ApiModel(description = "All details about the user")
public class User {

	private Integer id;

	@Size(min = 2, message = "Name should hve at least 2 characters")
	@ApiModelProperty(notes = "Name should hve at least 2 characters")
	private String name;

	@Past
	@ApiModelProperty(notes = "Birth date cannot be in the past")
	private Date birthDate;

	protected User() {
		super();
	}

}
