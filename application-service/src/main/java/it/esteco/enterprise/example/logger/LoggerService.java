package it.esteco.enterprise.example.logger;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;

import java.util.logging.Logger;

@ApplicationScoped
public class LoggerService {

    public static final Logger LOGGER = Logger.getLogger(LoggerService.class.getName());

    public void log(@Observes LoggerEvent loggerEvent) {
        LOGGER.info(loggerEvent.getMessage());
    }

}
