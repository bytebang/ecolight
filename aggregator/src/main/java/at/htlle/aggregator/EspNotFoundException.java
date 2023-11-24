package at.htlle.aggregator;

public class EspNotFoundException extends RuntimeException{

    EspNotFoundException(long id) {
        super("Could not find ESP with id" + id);
    }
}
