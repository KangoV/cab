package io.kangov.taxii.server.domain;

import java.util.List;

public interface TaxiiRepository {

    Server getServer();

    List<Root> getRoots();

}
