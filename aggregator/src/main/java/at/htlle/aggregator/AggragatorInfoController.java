package at.htlle.aggregator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("info")
public class AggragatorInfoController 
{

	private final EspRepository espRepository;

	public AggragatorInfoController(EspRepository espRepository) {
		this.espRepository = espRepository;
	}

	@GetMapping("/location")
    public String getAggregatorLocation(@Value("${aggregator.location}") String location) 
	{
		return location;
    }


	@GetMapping
	public List<ESP> espListAll() {
		return (List<ESP>) espRepository.findAll();
	}

	@GetMapping
	public ESP listOneEsp(long id) {
		return espRepository.findById(id).orElseThrow(() -> new EspNotFoundException(id));
	}

	@PostMapping
	public ESP newESP(@RequestBody ESP newESP) {
		return espRepository.save(newESP);
	}

	@DeleteMapping
	public void deleteESP(@PathVariable long id) {
		espRepository.deleteById(id);
	}

}
