package at.htlle.aggregator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("info")
public class AggragatorInfoController 
{

	@GetMapping("/location")
    public String getAggregatorLocation(@Value("${aggregator.location}") String location) 
	{
		return location;
    }

}
