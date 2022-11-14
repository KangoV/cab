package io.kangov.taxii.server.domain;

import io.kangov.taxii.server.ImmutableStyle;
import org.immutables.value.Value;

import java.util.function.UnaryOperator;

@Value.Immutable
@ImmutableStyle
public interface Contact {

  /**
   * Exposes the generated builder outside this package
   * <p>
   * While the generated implementation (and consequently its builder) is not
   * visible outside this package, this builder inherits and exposes all public
   * methods defined on the generated implementation's Builder class.
   */
  class Builder extends ServerContactImpl.Builder {}

  static Contact create(UnaryOperator<Builder> spec) { return spec.apply(builder()).build(); }
  static Contact createContact(UnaryOperator<Contact.Builder> spec) { return create(spec); }
  static Contact.Builder builder() { return new Contact.Builder(); }

  default Contact update(UnaryOperator<Contact.Builder> builder) {
    return builder.apply(builder().from(this)).build();
  }

  String getName();
  String getEmail();
}
