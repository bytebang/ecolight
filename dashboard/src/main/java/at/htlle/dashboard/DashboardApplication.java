package at.htlle.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(DashboardApplication.class, args);
	}

}
/*
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @GetMapping("/home")
    public String home(Model model) {
        // Add model attributes if needed for rendering HTML
        return "home"; // Thymeleaf template name (e.g., home.html)
    }

    @PostMapping("/receive-data")
    @ResponseBody
    public String receiveData(@RequestBody String data) {
        // Process the received data
        System.out.println("Received data: " + data);
        return "Data received successfully!";
    }
}
*/
