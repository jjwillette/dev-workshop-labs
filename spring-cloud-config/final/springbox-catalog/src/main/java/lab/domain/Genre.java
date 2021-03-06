package lab.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="genres")
public class Genre {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable=false)
	private String mlId;
	
	@Column(nullable=false)
	private String name;
	
	@ManyToMany(mappedBy="genres")
	@JsonIgnore
	private List<Movie> movies;

	public Long getId() {
		return id;
	}

	public String getMlId() {
		return mlId;
	}

	public String getName() {
		return name;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setMlId(String mlId) {
		this.mlId = mlId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
	
	
}

