package wikira.springdidemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import wikira.springdidemo.services.GreetingService;

//This here represents a wrong way to do DI

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
