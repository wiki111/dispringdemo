package wikira.springdidemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_MATE = "Hello m8!";

    @Override
    public String sayGreeting(){
        return HELLO_MATE;
    }
}
