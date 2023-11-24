package at.htlle.aggregator.pojos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class HardwareAsset {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private long id;

	private String loc;




	public HardwareAsset(String location) {
		this.loc = location;

	}

	public HardwareAsset() {

	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}


}