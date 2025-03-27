package it.esteco.enterprise.example;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("hello")
public class ExampleEndpoint {

    @Inject
    ExampleService service;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello() {
        return service.sayHello();
    }

    @Path("count")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getGreetingsCount() {
        return String.valueOf(service.getGreetingsCount());
    }
}
