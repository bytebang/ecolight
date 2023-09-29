package at.htlle.aggregator;

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
	public CommandLineRunner demo(PersonRepository repository) {
		return (args) -> {
			// save a few customers
			
			log.info("Save some persons");
			repository.save(new Person("Jack", "Bauer"));
			repository.save(new Person("Chloe", "O'Brian"));
			repository.save(new Person("Kim", "Bauer"));
			repository.save(new Person("David", "Palmer"));
			repository.save(new Person("Michelle", "Dessler"));

			// fetch all customers
			log.info("There are now " + repository.count() + " Persons in the database");		};
	}
}
