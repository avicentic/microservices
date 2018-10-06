package rs.avicentic.restfullwebservices.filtering;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
//@JsonIgnoreProperties(value = { "field2", "field3" })
public class SomeBean {

	private String field1;
	private String field2;
	@JsonIgnore
	private String field3;

}
