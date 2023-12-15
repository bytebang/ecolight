import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RESTController {

    @PostMapping("/historicalvalues")
    @ResponseBody
    public ResponseEntity<double[]> receiveHistoricalValues(@RequestBody double[] historicalValues) {
        // Process the received data
        for (double value : historicalValues) {
            System.out.println("Received historical value: " + value);
            // You can perform additional processing here if needed
        }

        // Assuming you want to return a response with the same array
        return new ResponseEntity<>(historicalValues, HttpStatus.OK);
    }

    @PostMapping("/currentvalues")
    @ResponseBody
    public ResponseEntity<double[]> receiveCurrentValues(@RequestBody double[] currentValues) {
        // Process the received data
        for (double value : currentValues) {
            System.out.println("Received current value: " + value);
            // You can perform additional processing here if needed
        }

        // Assuming you want to return a response with the same array
        return new ResponseEntity<>(currentValues, HttpStatus.OK);
    }
}
