package wikira.springdidemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import wikira.springdidemo.services.GreetingService;
import wikira.springdidemo.services.GreetingServiceImpl;

@Controller
public class SetterInjectedController {

    //Use interface instead of concrete class. Now any implementation of
    //the interface may be injected here. Dependency injection FTW.
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    @Autowired
    public void setGreetingService(
            @Qualifier("greetingServiceSetter") GreetingService greetingService){
        this.greetingService = greetingService;
    }

}
