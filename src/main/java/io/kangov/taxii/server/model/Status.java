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

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.micronaut.core.annotation.Nullable;
import org.immutables.value.Value;
import io.kangov.taxii.server.ImmutableStyle;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/**
 * The status resource represents information about a request to add objects to a Collection. It contains information
 * about the status of the request, such as whether it&#39;s completed (status) and MAY contain the status of
 * individual objects within the request (i.e. whether they are still pending, completed and failed, or completed and
 * succeeded).
 */
@JsonPropertyOrder({
  Status.JSON_PROPERTY_ID,
  Status.JSON_PROPERTY_STATUS,
  Status.JSON_PROPERTY_REQUEST_TIMESTAMP,
  Status.JSON_PROPERTY_TOTAL_COUNT,
  Status.JSON_PROPERTY_SUCCESS_COUNT,
  Status.JSON_PROPERTY_SUCCESSES,
  Status.JSON_PROPERTY_FAILURE_COUNT,
  Status.JSON_PROPERTY_FAILURES,
  Status.JSON_PROPERTY_PENDING_COUNT,
  Status.JSON_PROPERTY_PENDINGS
})
@JsonTypeName("status")
@JsonSerialize(as = StatusImpl.class)
@JsonDeserialize(as = StatusImpl.class)
//@Introspected
@Value.Immutable
@ImmutableStyle
public interface Status {

//    /**
//     * Exposes the generated builder outside this package
//     * <p>
//     * While the generated implementation (and consequently its builder) is not
//     * visible outside this package, this builder inherits and exposes all public
//     * methods defined on the generated implementation's Builder class.
//     */
////    @Introspected
//    class Builder extends StatusImpl.Builder {}
//
//    static Status create(UnaryOperator<Builder> spec) { return spec.apply(builder()).build(); }
//    static Status createStatus(UnaryOperator<Builder> spec) { return create(spec); }
//    static Builder builder() { return new Builder(); }
//
//    default Status update(UnaryOperator<Builder> builder) {
//        return builder.apply(new Builder()).build();
//    }

    String JSON_PROPERTY_ID = "id";
    String JSON_PROPERTY_STATUS = "status";
    String JSON_PROPERTY_REQUEST_TIMESTAMP = "request_timestamp";
    String JSON_PROPERTY_TOTAL_COUNT = "totalCount";
    String JSON_PROPERTY_SUCCESS_COUNT = "success_count";
    String JSON_PROPERTY_SUCCESSES = "successes";
    String JSON_PROPERTY_FAILURE_COUNT = "failure_count";
    String JSON_PROPERTY_FAILURES = "failures";
    String JSON_PROPERTY_PENDING_COUNT = "pending_count";
    String JSON_PROPERTY_PENDINGS = "pendings";

    /**
     * Get id
     * @return id
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    UUID getId();

    /**
     * Get status
     * @return status
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    RequestStatus getStatus();

    /**
     * Get requestTimestamp
     * @return requestTimestamp
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_REQUEST_TIMESTAMP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    OffsetDateTime getRequestTimestamp();

    /**
     * The total number of objects that were in the request, which would be the number of objects in the envelope. The
     * value of the total_count MUST be a positive integer greater than or equal to zero. If this property has a value
     * of 0, then the TAXII Server has not yet started processing the request.
     * @return totalCount
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    Integer getTotalCount();

    /**
     * The number of objects that were successfully created. The value of the success_count MUST be a positive integer
     * greater than or equal to zero.
     * @return successCount
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_SUCCESS_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    Integer getSuccessCount();


    /**
     * A list of objects that was successfully processed.
     * @return successes
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_SUCCESSES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    List<StatusDetails> getSuccesses();

    /**
     * The number of objects that failed to be created. The value of the failure_count MUST be a positive integer
     * greater than or equal to zero.
     * @return failureCount
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_FAILURE_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    Integer getFailureCount();

    /**
     * A list of objects that was not successfully processed.
     * @return failures
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_FAILURES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    List<StatusDetails> getFailures();

    /**
     * The number of objects that have yet to be processed. The value of the pending_count MUST be a positive integer
     * greater than or equal to zero.
     * @return pendingCount
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_PENDING_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    Integer getPendingCount();

    /**
     * A list of objects that have yet to be processed.
     * @return pendings
     **/
    @Nullable
    @JsonProperty(JSON_PROPERTY_PENDINGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    List<StatusDetails> getPendings();

}
