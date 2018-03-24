package wikira.springdidemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary
public class GreetingServicePrimarySpanish implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Un mago nunca llega tarde ni demasiado temprano, pero llega exactamente cuando lo desea.";
    }
}
