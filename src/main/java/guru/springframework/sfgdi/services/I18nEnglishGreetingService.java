package guru.springframework.sfgdi.services;

//@Profile("EN")  // causes spring to use this profile specified in the application.properties (if no "default" is specified anywhere else)
//@Service("i18nService") // moved to Java configuration GreetingServiceCofig.java
public class I18nEnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
