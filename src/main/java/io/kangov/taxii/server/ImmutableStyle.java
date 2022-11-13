package io.kangov.taxii.server;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.immutables.value.Value;
import org.immutables.value.Value.Style.ImplementationVisibility;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * A style annotation that can be used on interfaces annotated via the Immutable
 * library to alter how the creation process is performed.
 * <p>
 * The overshadowImplementation = true style attribute makes sure that build()
 * will be declared to return abstract value type Person, not the implementation
 * ImmutablePerson, following metaphor: implementation type will be
 * "overshadowed" by abstract value type.
 * <p>
 * Essentially, the generated class becomes implementation detail without much
 * boilerplate which is needed to fully hide implementation behind user-written
 * code.
 *
 * @since 0.5.0
 */
@Target({ElementType.PACKAGE, ElementType.TYPE})
@Retention(RetentionPolicy.CLASS) // Make it class retention for incremental compilation
@Value.Style(
    visibility = ImplementationVisibility.PACKAGE,
    overshadowImplementation = true,
    typeImmutable = "*Impl",
    typeAbstract = {"*"},
    depluralize = true,
    passAnnotations = {
        JsonPropertyOrder.class,
        JsonTypeName.class
        },
    defaults = @Value.Immutable(copy = false))
public @interface ImmutableStyle { // empty
}
