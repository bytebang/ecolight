package at.htlle.aggregator;

import at.htlle.aggregator.pojos.HardwareAsset;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AggregatorApplication {

	// A logger
	private static final Logger log = LoggerFactory.getLogger(AggregatorApplication.class);
	
	// The main method of the application
	public static void main(String[] args) 
	{
		SpringApplication.run(AggregatorApplication.class, args);

	}

	@Bean
	public CommandLineRunner demo(HardwareAssetRepository repository) {
		return (args) -> {
			// save a few customers
			
			log.info("Save some HardwareAssets");

			//repository.save(new HardwareAsset("HTL"));


			// fetch all customers
			log.info("There are now " + repository.count() + " HardwareAssets in the database");		};
	}
}