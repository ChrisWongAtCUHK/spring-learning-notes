package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HelloGradleController {
    @Autowired
    private HelloService helloService;

    @GetMapping
    public String helloGradle() {
        return this.helloService.getHelloMessage("Gradle");
    }
}
