package wikira.springdidemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import wikira.springdidemo.services.GreetingService;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    // actually the constructor based DI is autowired automatically
    // so annotation is optional
    public ConstructorInjectedController(
            @Qualifier("greetingServiceConstructor") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
