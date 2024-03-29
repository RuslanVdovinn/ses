package ses.client.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import store.EnableSesStore;

@Import({
        EnableSesStore.class
})
@Configuration
public class ImportConfig {
}
