package at.htlle.aggregator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ESP {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private long id;

	private String location;




	public ESP(String location) {
		this.location = location;

	}

	public ESP() {

	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}


}