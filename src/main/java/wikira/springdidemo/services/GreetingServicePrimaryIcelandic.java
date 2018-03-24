package wikira.springdidemo.services;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("is")
public class GreetingServicePrimaryIcelandic implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Halló vinur.";
    }
}
