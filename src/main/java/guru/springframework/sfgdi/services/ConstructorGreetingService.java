package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

//@Service // The @Service config is now being done in GreetingServiceConfig
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
