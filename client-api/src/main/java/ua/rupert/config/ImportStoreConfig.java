package ua.rupert.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import ua.rupert.store.EnableStore;

@Import({
        EnableStore.class
})
@Configuration
public class ImportStoreConfig {
}
