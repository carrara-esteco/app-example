package it.esteco.enterprise.example;

import io.vertx.core.Vertx;
import it.esteco.enterprise.example.logger.LoggerEvent;
import it.esteco.enterprise.example.persistence.Greeting;
import it.esteco.enterprise.example.persistence.GreetingRepository;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@Dependent
public class ExampleService {

    @Inject
    Event<LoggerEvent> loggerEvent;
    @Inject
    GreetingRepository greetingRepository;

    @Transactional
    public String sayHello() {
        loggerEvent.fire(new LoggerEvent("Someone is here..."));
        String message = "Hello ezample!";

        Greeting greeting = new Greeting();
        greeting.message = message;
        greeting.persist();

        return message;
    }

    public long getGreetingsCount() {
        return greetingRepository.getNumberOfGreetings();
    }
}
