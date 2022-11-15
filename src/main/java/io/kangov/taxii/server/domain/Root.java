package io.kangov.taxii.server.domain;

import io.kangov.taxii.server.ImmutableStyle;
import org.immutables.value.Value;

import java.util.*;
import java.util.function.UnaryOperator;

@Value.Immutable
@ImmutableStyle
public interface Root {

  /**
   * Exposes the generated builder outside this package
   * <p>
   * While the generated implementation (and consequently its builder) is not
   * visible outside this package, this builder inherits and exposes all public
   * methods defined on the generated implementation's Builder class.
   */
  class Builder extends RootImpl.Builder {
    public Builder isDefault() {
      return isDefault(true);
    }
  }

  static Root create(UnaryOperator<Builder> spec) { return spec.apply(builder()).build(); }
  static Root createRootInfo(UnaryOperator<Root.Builder> spec) { return create(spec); }
  static Root.Builder builder() { return new Root.Builder(); }

  default Root update(UnaryOperator<Root.Builder> builder) {
    return builder.apply(builder().from(this)).build();
  }

  @Value.Default
  default UUID getId() {
    return UUID.randomUUID();
  }
  boolean isDefault();
  String getName();
  String getDescription();
  String getDomain();
  String getPath();
  Set<String> getVersions();
  int getMaxContentLength();

  default String asString() {
    return getDomain() + getPath();
  }

}
