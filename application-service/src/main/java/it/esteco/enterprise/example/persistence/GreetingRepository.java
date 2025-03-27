package it.esteco.enterprise.example.persistence;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingRepository implements PanacheRepository<Greeting> {

    public long getNumberOfGreetings() {
        return Greeting.count();
    }

}
