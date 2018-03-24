package wikira.springdidemo.controller;


import org.springframework.stereotype.Controller;
import wikira.springdidemo.services.GreetingService;

@Controller
public class MyController {

        private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
            return greetingService.sayGreeting();
    }

}
