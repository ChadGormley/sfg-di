package guru.springframework.sfgdi.services;

//@Profile({"ES", "default"}) // the "default" causes spring to use this profile if one isn't specified in the application.properties
//@Service("i18nService") // moved to Java configuration GreetingServiceCofig.java
public class I18nSpanishGreetingService  implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
