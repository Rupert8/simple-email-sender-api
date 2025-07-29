package ua.rupert.store;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("ua.rupert.store")
@EntityScan("ua.rupert.store.entities")
@EnableJpaRepositories("ua.rupert.store.repositories")
public class EnableStore {
}
