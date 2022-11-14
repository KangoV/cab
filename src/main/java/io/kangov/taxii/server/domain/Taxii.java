package io.kangov.taxii.server.domain;

import jakarta.inject.Singleton;

@Singleton
public class Taxii {

  public Server getServerInfo() {;
    return Server.create(spec -> spec
      .title("title")
      .description("description")
      .contact(spec1 -> spec1
        .name("Darren")
        .email("to@domain.com"))
      .addRoot(s2 -> s2
        .domain("localhost")
        .name("default")
        .description("The default root")
        .isDefault()
        .path("/default")
        .addVersion("application/taxii+json;version=2.1")
        .maxContentLength(1_000_000)
      )
    );
  }

}
