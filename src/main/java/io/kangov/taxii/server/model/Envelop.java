/*
 * TAXII Client API
 * TAXII Client API (2.1)
 *
 * The version of the OpenAPI document: 0.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.kangov.taxii.server.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.micronaut.core.annotation.Nullable;
import org.immutables.value.Value;
import io.kangov.taxii.server.ImmutableStyle;

import java.util.Set;

/**
 * The envelope is a simple wrapper for STIX 2 content. When returning STIX 2 content in a TAXII response the HTTP root
 * object payload MUST be an envelope. This specification does not define any other form of content wrapper for objects
 * outside STIX content.
 */
@JsonPropertyOrder({
  Envelop.JSON_PROPERTY_MORE,
  Envelop.JSON_PROPERTY_NEXT,
  Envelop.JSON_PROPERTY_OBJECTS
})
@JsonTypeName("envelop")
@JsonSerialize(as = EnvelopImpl.class)
@JsonDeserialize(as = EnvelopImpl.class)
//@Introspected
@Value.Immutable
@ImmutableStyle
public interface Envelop {

//    /**
//     * Exposes the generated builder outside this package
//     * <p>
//     * While the generated implementation (and consequently its builder) is not
//     * visible outside this package, this builder inherits and exposes all public
//     * methods defined on the generated implementation's Builder class.
//     */
//    class Builder extends EnvelopImpl.Builder {}
//
//    static Envelop create(UnaryOperator<Builder> spec) { return spec.apply(builder()).build(); }
//    static Envelop createEnvelop(UnaryOperator<Builder> spec) { return create(spec); }
//    static Builder builder() { return new Builder(); }
//
//    default Envelop update(UnaryOperator<Builder> builder) {
//        return builder.apply(new Builder()).build();
//    }

    String JSON_PROPERTY_MORE = "more";
    String JSON_PROPERTY_NEXT = "next";
    String JSON_PROPERTY_OBJECTS = "objects";

    /**
     * This property identifies if there is more content available based on the search criteria. The absence of this
     * property means the value is false.
     *
     * @return more
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_MORE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    Boolean getMore();

    /**
     * This property identifies the server provided value of the next record or set of records in the paginated data
     * set. This property MAY be populated if the more property is set to true.
     *
     * @return next
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_NEXT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    String getNext();

    /**
     * This property contains one or more STIX Objects. Objects in this list MUST be a STIX Object (e.g., SDO, SCO, SRO,
     * Language Content object, or a Marking Definition object).
     *
     * @return objects
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_OBJECTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    Set<Object> getObjects();

}
