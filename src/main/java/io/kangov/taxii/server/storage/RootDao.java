package io.kangov.taxii.server.storage;

import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.annotation.Query;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;

import javax.validation.constraints.NotNull;
import java.util.Map;
import java.util.UUID;

@Repository
@JdbcRepository(dialect = Dialect.POSTGRES)
public interface RootDao extends CrudRepository<RootDao.ApiRoot, UUID> {

    @MappedEntity("api_root")
    record ApiRoot(
        @Id @NotNull UUID id,
        @NotNull boolean isDefault,
        @NotNull String name,
        String description,
        String domain,
        String path,
        String versions,
        int maxContentLength
    ) {}

    @Query("select key,value from config")
    Map<String,String> asMap();

}
