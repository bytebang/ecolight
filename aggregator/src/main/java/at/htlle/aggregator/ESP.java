package at.htlle.aggregator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Timestamp;
import java.util.HashMap;

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

	public String getLocation() {
		return loc;
	}

	public void setLocation(String location) {
		this.loc = location;
	}


}