package at.htlle.aggregator.pojos;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

@Entity
public class HardwareAsset {

	@Value("${default-lowerbound}")
	Double defaultLowerbound;

	@Value("${default-upperbound}")
	Double defaultUpperbound;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private long id;

	private String loc;
	@OneToMany(mappedBy = "hardwareAsset")
	List<TempValue> tempValues;
/*
	public HardwareAsset(String location) {
		this.loc = location;
		System.out.println(defaultLowerbound);
		System.out.println(defaultUpperbound);
	}


 */
	public HardwareAsset() {

	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public List<TempValue> getTempValues() {
		return tempValues;
	}

	public void setTempValues(List<TempValue> tempValues) {
		this.tempValues = tempValues;
	}
}