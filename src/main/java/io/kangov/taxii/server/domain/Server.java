package io.kangov.taxii.server.domain;

import io.kangov.taxii.server.ImmutableStyle;
import org.immutables.value.Value;

import java.util.List;
import java.util.function.UnaryOperator;

@Value.Immutable
@ImmutableStyle
public interface Server {

  /**
   * Exposes the generated builder outside this package
   * <p>
   * While the generated implementation (and consequently its builder) is not
   * visible outside this package, this builder inherits and exposes all public
   * methods defined on the generated implementation's Builder class.
   */
  class Builder extends ServerImpl.Builder {
    public Builder contact(UnaryOperator<Contact.Builder> func) {
      return contact(func.apply(Contact.builder()).build());
    }
    public Builder addRoot(UnaryOperator<Root.Builder> func) {
      return addApiRoot(func.apply(Root.builder()).build());
    }
  }

  static Server create(UnaryOperator<Builder> spec) { return spec.apply(builder()).build(); }
  static Server createServerInfo(UnaryOperator<Server.Builder> spec) { return create(spec); }
  static Server.Builder builder() { return new Server.Builder(); }

  default Server update(UnaryOperator<Server.Builder> builder) {
    return builder.apply(builder().from(this)).build();
  }

  String getTitle();
  String getDescription();
  Contact getContact();
  List<Root> getApiRoots();

}
