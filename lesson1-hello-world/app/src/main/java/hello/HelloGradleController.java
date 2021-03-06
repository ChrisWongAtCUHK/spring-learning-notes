package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HelloGradleController {
    @Autowired
    private HelloService helloService;

    // a basic and mostly useless example
    @Value("string value")
    private String stringValue;

    // get Value got from the file assigned to the field
    @Value("${value.from.file}")
    private String valueFromFile;

    // run 
    //      ./gradlew bootRun --args='--systemValue=arguments'
    // or the value would be "defaule value"
    @Value("${systemValue:default value}")
    private String systemValue;

    // a bunch of values
    @Value("${listOfValues}")
    private String[] valuesArray;

    @GetMapping
    public String helloGradle() {
        return this.helloService.getHelloMessage(String.join("", valuesArray));
    }
}
