package rs.avicentic.restfullwebservices.user;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;
//import lombok.ToString;

@Getter
@Setter
//@ToString
//@AllArgsConstructor
@Entity
public class Post {

	@Id
	@GeneratedValue
	private Integer id;

	private String desription;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private User user;

	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Post(Integer id, String desription) {
		super();
		this.id = id;
		this.desription = desription;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", desription=" + desription + "]";
	}

}
