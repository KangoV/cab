package io.kangov.taxii.server.storage;

import io.kangov.taxii.server.domain.Root;
import io.kangov.taxii.server.domain.Server;
import io.kangov.taxii.server.domain.TaxiiRepository;
import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class TaxiiMemoryRepository implements TaxiiRepository {

    @Override
    public Server getServer() {
        return Server.create(spec -> spec
            .title("title")
            .description("description")
            .contact(spec1 -> spec1
                .name("Darren")
                .email("to@domain.com"))
            .addAllApiRoots(getRoots())
        );
    }

    @Override
    public List<Root> getRoots() {
        return List.of(Root.create(s2 -> s2
            .domain("localhost")
            .name("default")
            .description("The default root")
            .isDefault()
            .path("/default")
            .addVersion("application/taxii+json;version=2.1")
            .maxContentLength(1_000_000)));
    }
}
