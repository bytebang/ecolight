import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")  // Set a common base path for your API
public class RESTController {

    @GetMapping("/historicalvalues")
    @ResponseBody
    public ResponseEntity<String> getHistoricalValues() {
        // Simulate retrieving historical values from a data source
        double[] historicalValues = {1.0, 2.0, 3.0};

        // Assuming you want to return a response with the array
        return new ResponseEntity<>("{\"historicalValues\":" + Arrays.toString(historicalValues) + "}", HttpStatus.OK);
    }

    @GetMapping("/currentvalues")
    @ResponseBody
    public ResponseEntity<String> getCurrentValues() {
        // Simulate retrieving current values from a data source
        double[] currentValues = {4.0, 5.0, 6.0};

        // Assuming you want to return a response with the array
        return new ResponseEntity<>("{\"currentValues\":" + Arrays.toString(currentValues) + "}", HttpStatus.OK);
    }
}
