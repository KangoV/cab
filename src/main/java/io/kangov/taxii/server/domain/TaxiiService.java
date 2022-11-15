package io.kangov.taxii.server.domain;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class TaxiiService {

  private final TaxiiRepository taxiiRepository;

  @Inject
  public TaxiiService(TaxiiRepository taxiiRepository) {
    this.taxiiRepository = taxiiRepository;
  }

  public Server getServerInfo() {;
    return taxiiRepository.getServer();
  }

}
