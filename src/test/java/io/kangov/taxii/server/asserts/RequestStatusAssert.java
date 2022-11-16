package io.kangov.taxii.server.asserts;

import java.util.Objects;

import io.kangov.taxii.server.web.model.RequestStatus;
import org.assertj.core.api.AbstractComparableAssert;

/**
 * {@link RequestStatus} specific assertions - Generated by CustomAssertionGenerator.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class RequestStatusAssert extends AbstractComparableAssert<RequestStatusAssert, RequestStatus> {

  /**
   * Creates a new <code>{@link RequestStatusAssert}</code> to make assertions on actual RequestStatus.
   * @param actual the RequestStatus we want to make assertions on.
   */
  public RequestStatusAssert(RequestStatus actual) {
    super(actual, RequestStatusAssert.class);
  }

  /**
   * An entry point for RequestStatusAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myRequestStatus)</code> and get specific assertion with code completion.
   * @param actual the RequestStatus we want to make assertions on.
   * @return a new <code>{@link RequestStatusAssert}</code>
   */
  @org.assertj.core.util.CheckReturnValue
  public static RequestStatusAssert assertThat(RequestStatus actual) {
    return new RequestStatusAssert(actual);
  }

  /**
   * Verifies that the actual RequestStatus's value is equal to the given one.
   * @param value the given value to compare the actual RequestStatus's value to.
   * @return this assertion object.
   * @throws AssertionError - if the actual RequestStatus's value is not equal to the given one.
   */
  public RequestStatusAssert hasValue(String value) {
    // check that actual RequestStatus we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting value of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualValue = actual.getValue();
    if (!Objects.deepEquals(actualValue, value)) {
      failWithMessage(assertjErrorMessage, actual, value, actualValue);
    }

    // return the current assertion for method chaining
    return this;
  }

}