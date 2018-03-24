package wikira.springdidemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceSetter implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello m8 ! I was injected by a setter !";
    }
}
