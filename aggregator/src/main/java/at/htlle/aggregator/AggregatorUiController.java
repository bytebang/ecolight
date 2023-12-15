package at.htlle.aggregator;

import at.htlle.aggregator.pojos.HardwareAsset;
import at.htlle.aggregator.pojos.TempValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("API/v1")
public class AggregatorUiController {

	private final at.htlle.aggregator.espRepository espRepository;
	private TempValue tempValue;
	private List<HardwareAsset> hardwareAssets;

	public AggregatorUiController(at.htlle.aggregator.espRepository espRepository) {
		this.espRepository = espRepository;
	}

	@GetMapping("/location")
	public String getAggregatorLocation(@Value("${aggregator.location}") String location) {
		return location;
	}

	@GetMapping("/listHardware")
	public List<HardwareAsset> espListAll() {
		return (List<HardwareAsset>) espRepository.findAll();
	}

	@GetMapping("/listoneHardware")
	public List<HardwareAsset> listOneEsp(long id) {
		return espRepository.findById(id);
	}

	@PostMapping("/addHardware")
	public HardwareAsset newESP(@RequestBody HardwareAsset newESP) {
		return espRepository.save(newESP);
	}

	@DeleteMapping("/removeHardware")
	public void deleteESP(@PathVariable long id) {
		espRepository.deleteById(id);
	}


	@GetMapping("/getTempValue")
	public double getTempValue(long id) {
		return 0;

	}
	@GetMapping("/setUpperBound")
	public double setUpperBound(long id, double value) {
		return 0;
	}
	@GetMapping("/setLowerBound")
	public double setLowerBound(long id, double value) {
		return 0;
	}



}


