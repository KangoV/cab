package io.kangov.taxii.server.storage;

import io.kangov.taxii.server.domain.Root;
import io.kangov.taxii.server.domain.Server;
import io.kangov.taxii.server.domain.TaxiiRepository;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Singleton
public class TaxiiRepositoryDb implements TaxiiRepository {

    private static final String TAXII_SERVER_TITLE = "taxii.server.title";
    private static final String TAXII_SERVER_DESCRIPTION = "taxii.server.description";
    private static final String TAXII_SERVER_NAME = "taxii.server.contact.name";
    private static final String TAXII_SERVER_EMAIL = "taxii.server.contact.email";

    @Inject ConfigLineDao configLineDao;
    @Inject RootDao rootDao;

    @Override
    public Server getServer() {
        var config = toMap(configLineDao.findAll());
        return Server.create(spec -> spec
            .title(config.get(TAXII_SERVER_TITLE))
            .description(config.get(TAXII_SERVER_DESCRIPTION))
            .contact(spec1 -> spec1
                .name(config.get(TAXII_SERVER_NAME))
                .email(config.get(TAXII_SERVER_EMAIL)))
            .addAllApiRoots(getRoots())
        );
    }

    @Override
    public List<Root> getRoots() {
        return stream(rootDao.findAll())
            .map(r -> Root.create(s2 -> s2
                .domain(r.domain())
                .name(r.name())
                .description(r.description())
                .isDefault(r.isDefault())
                .path(r.path())
                .addVersions(r.versions().split(","))
                .maxContentLength(r.maxContentLength())))
            .toList();
    }

    static <T> Stream<T> stream(Iterable<T> iterable) {
        return StreamSupport.stream(iterable.spliterator(), false);
    }

    static Map<String,String> toMap(Iterable<ConfigLineDao.ConfigLine> configLines) {
        return stream(configLines).collect(Collectors.toMap(
            ConfigLineDao.ConfigLine::key,
            ConfigLineDao.ConfigLine::Value));

    }
}
