package at.htlle.aggregator.hardware_connector;

import at.htlle.aggregator.dashboard_connector.EntityManagerSingleton;
import at.htlle.aggregator.pojos.TempValue;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hardwareapi/v1")
public class HardwareConnector {

    @PostMapping("/temperature")
    public ResponseEntity<TempValue> getTemperatureBounds(@RequestBody TempValue tempValue) {
        double receivedTemperature = tempValue.getTempLowerBound();
        EntityManagerSingleton.getEntityManager().getTransaction();
        Double upperbound = 20.0;
        Double lowerbound = 16.0;
        EntityManagerSingleton.getEntityManager().persist(new TempValue(receivedTemperature,upperbound,lowerbound));

        return ResponseEntity.ok(new TempValue(receivedTemperature,upperbound,lowerbound));
    }
}
