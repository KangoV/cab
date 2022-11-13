package io.kangov.taxii.server.controller;


import static org.assertj.core.api.Assertions.*;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.*;
import io.kangov.taxii.server.model.Discovery;

@MicronautTest
public class DiscoveryTest {

    @Client("/") interface Endpoint {
        @Get("/taxii2")
        @Header(name="Accept", value="application/taxii+json;version=2.1")
        HttpResponse<Discovery> get();
    }

    @Inject Endpoint endpoint;

    /**
     * Model tests for Discovery
     */
    @Test
    public void testDiscovery() {

        var resp = endpoint.get();
        assertThat(resp).isNotNull();
        assertThat(resp.code()).isEqualTo(200);
        var discovery = resp.getBody().get();
        assertThat(discovery.getContact()).isEqualTo("darren");

    }

}
