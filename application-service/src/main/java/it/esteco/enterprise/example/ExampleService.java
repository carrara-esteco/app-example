package it.esteco.enterprise.example;

import jakarta.enterprise.context.Dependent;

@Dependent
public class ExampleService {

    public String sayHello() {
        return "Hello ezample!";
    }
}
