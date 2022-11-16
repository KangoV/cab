package io.kangov.taxii.server.web;


import static io.kangov.taxii.server.asserts.DiscoveryAssert.assertThat;
import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

import io.kangov.taxii.server.asserts.DiscoveryAssert;
import io.micronaut.flyway.FlywayConfigurationProperties;
import io.micronaut.flyway.FlywayMigrator;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.assertj.core.api.Assertions;
import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.*;
import io.kangov.taxii.server.web.model.Discovery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sql.DataSource;

@MicronautTest
public class DiscoveryTest {

    private static final Logger log = LoggerFactory.getLogger(DiscoveryTest.class);

    @Client("/")
    interface Endpoint {
        @Get("/taxii2")
        @Header(name="Accept", value="application/taxii+json;version=2.1")
        HttpResponse<Discovery> get();
    }

    @Inject DataSource dataSource;
    @Inject FlywayMigrator flyway;
    @Inject Endpoint endpoint;

    @AfterEach
    public void afterEach() {
    }

    @BeforeEach
    public void beforeEach() {
        log.debug("before each");
        FlywayConfigurationProperties v = new FlywayConfigurationProperties("test");
        flyway.run(v, dataSource );
    }

    @Test
    public void testDiscovery() {
        var resp = endpoint.get();
        assertThat(resp).isNotNull();
        assertThat(resp.code()).isEqualTo(200);
        assertThat(resp.getBody().get())
            .hasTitle("KangoV")
            .hasDescription("KangoV TAXII Server")
            .hasContact("Joe Blogs - joe.blogs@blogsdomain.com")
            .hasApiRoots("http://mydomain/path", "http://mydomain/path");
    }

}
