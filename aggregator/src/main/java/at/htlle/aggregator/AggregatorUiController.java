package at.htlle.aggregator;

import at.htlle.aggregator.pojos.HardwareAsset;
import at.htlle.aggregator.pojos.TempValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("API/v1")
public class AggregatorUiController {

	private HardwareAssetRepository hardwareAssetRepository;
	private TempRepository tempRepository;
	private TempValue tempValue;
	private List<HardwareAsset> hardwareAssets;

	public AggregatorUiController(HardwareAssetRepository hardwareAssetRepository) {
		this.hardwareAssetRepository = hardwareAssetRepository;
	}

	@GetMapping("/location")
	public String getAggregatorLocation(@Value("${aggregator.location}") String location) {
		return location;
	}

	@GetMapping("/listHardware")
	public List<HardwareAsset> espListAll() {
		return (List<HardwareAsset>) hardwareAssetRepository.findAll();
	}

	@GetMapping("/listoneHardware")
	public List<HardwareAsset> listOneEsp(long id) {
		return hardwareAssetRepository.findById(id);
	}

	@PostMapping("/addHardware")
	public HardwareAsset newESP(@RequestBody HardwareAsset newESP) {
		return hardwareAssetRepository.save(newESP);
	}

	@DeleteMapping("/removeHardware")
	public void deleteESP(@PathVariable long id) {
		hardwareAssetRepository.deleteById(id);
	}


	@GetMapping("/getTempValue")
	public HardwareAsset getTempValue(long id) {

		return hardwareAssetRepository.findById(id).get((int) tempValue.getActualTemp());

	}
	@GetMapping("/setUpperBound")
	public void setUpperBound(long id, int value) {
		HardwareAsset asset = hardwareAssetRepository.findById(id).get(0);
		asset.getTempValues().get(0).setTempUpperBound(value);






	}
	@GetMapping("/setLowerBound")
	public void setLowerBound(long id, double value) {
		HardwareAsset asset = hardwareAssetRepository.findById(id).get(0);
		asset.getTempValues().get(0).setTempLowerBound(value);

	}



}


