package wikira.springdidemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class GreetingServicePrimary implements GreetingService {

    @Override
    public String sayGreeting() {
        return "A wizard is never late nor too early, but comes exactly when he chooses to.";
    }
}
