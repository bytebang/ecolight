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

	private String loc;




	public ESP(String location) {
		this.loc = location;

	}

	public ESP() {

	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}


}