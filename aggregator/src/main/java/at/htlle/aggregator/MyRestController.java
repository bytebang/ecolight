package at.htlle.aggregator;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class MyRestController {

    @GetMapping(name = "getXXX")
    public Float getIregdwas()
    {
        return 42.0f;
    }
}
