import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RESTController {

    @PostMapping("/historicalvalues")
    @ResponseBody
    public String receiveData(@RequestBody String data) {
        // Process the received data
        System.out.println("Received data: " + data);
        return "Data received successfully!";
    }
}