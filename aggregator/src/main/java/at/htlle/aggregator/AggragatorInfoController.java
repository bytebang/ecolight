package at.htlle.aggregator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("info")
public class AggragatorInfoController 
{

	private final at.htlle.aggregator.espRepository espRepository;

	public AggragatorInfoController(at.htlle.aggregator.espRepository espRepository) {
		this.espRepository = espRepository;
	}

	@GetMapping("/location")
    public String getAggregatorLocation(@Value("${aggregator.location}") String location)
	{
		return location;
    }


	@GetMapping
	public List<HardwareAsset> espListAll() {
		return (List<HardwareAsset>) espRepository.findAll();
	}

	@GetMapping
	public HardwareAsset listOneEsp(long id) {
		return espRepository.findById(id).orElseThrow(() -> new EspNotFoundException(id));
	}

	@PostMapping
	public HardwareAsset newESP(@RequestBody HardwareAsset newESP) {
		return espRepository.save(newESP);
	}

	@DeleteMapping
	public void deleteESP(@PathVariable long id) {
		espRepository.deleteById(id);
	}

}
