package io.kangov.taxii.server.storage;

import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;
import javax.validation.constraints.NotNull;

@Repository
@JdbcRepository(dialect = Dialect.POSTGRES)
public interface ConfigLineDao extends CrudRepository<ConfigLineDao.ConfigLine, String> {

    @MappedEntity("config")
    record ConfigLine(
        @Id @NotNull  String key,
        @NotNull String Value
    ) {}

}
