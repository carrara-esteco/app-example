package it.esteco.enterprise.example.logger;

public class LoggerEvent {

    private final String message;

    public LoggerEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
