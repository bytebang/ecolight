package at.htlle.aggregator.hardware_connector;

import at.htlle.aggregator.HardwareAssetRepository;
import at.htlle.aggregator.dashboard_connector.EntityManagerSingleton;
import at.htlle.aggregator.pojos.HardwareAsset;
import at.htlle.aggregator.pojos.TempValue;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hardwareapi/v1")
public class HardwareConnector {

    @PostMapping("/temperature")
    public ResponseEntity<String> getTemperatureBounds(@RequestBody String requestBody) {
        // Process the received JSON manually
        // Assuming the incoming JSON looks like: {"temperature": 0}
        // You can use a JSON library like Jackson or Gson for more complex JSON processing

        // Simple manual extraction of temperature value from JSON string
        double receivedTemperature = extractTemperatureFromJson(requestBody);

        // Your logic to set upperbound and lowerbound
        EntityManagerSingleton.getEntityManager().getTransaction();
        Double upperbound = 20.0;
        Double lowerbound = 16.0;
        EntityManagerSingleton.getEntityManager().persist(new TempValue(receivedTemperature, upperbound, lowerbound));
        // Create the response JSON
        String jsonResponse = String.format("{\n" +
                "  \"upperBound\": %.1f,\n" +
                "  \"lowerBound\": %.1f\n" +
                "}", upperbound, lowerbound);

        return ResponseEntity.ok(jsonResponse);
    }

    // Method to extract temperature value from JSON string (Simple demonstration)
    private double extractTemperatureFromJson(String jsonString) {
        // This is a simple demonstration. In practice, use a JSON library for better handling
        // Here, manually extracting the temperature value from the JSON string
        double temperature = 0.0;
        try {
            String[] parts = jsonString.split(":");
            String value = parts[1].trim();
            temperature = Double.parseDouble(value.substring(0, value.length() - 1));
        } catch (Exception e) {
            e.printStackTrace(); // Handle parsing exceptions properly in real code
        }
        return temperature;
    }
}
