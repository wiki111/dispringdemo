package wikira.springdidemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"en", "default"})
public class GreetingServicePrimary implements GreetingService {

    @Override
    public String sayGreeting() {
        return "A wizard is never late nor too early, but comes exactly when he chooses to.";
    }
}
