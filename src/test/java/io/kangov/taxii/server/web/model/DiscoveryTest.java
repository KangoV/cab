package io.kangov.taxii.server.web.model;


import static org.assertj.core.api.Assertions.*;

import io.kangov.taxii.server.web.model.Discovery;
import org.junit.jupiter.api.Test;

public class DiscoveryTest {

    /**
     * Model tests for Discovery
     */
    @Test
    public void testDiscovery_optional_attributes() {
        assertThatExceptionOfType(IllegalStateException.class).isThrownBy(() -> Discovery.builder().build());
        assertThat(Discovery.builder().title("title").build()).isNotNull();
    }

}
