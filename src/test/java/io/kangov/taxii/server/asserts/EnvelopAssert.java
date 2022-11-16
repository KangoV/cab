package io.kangov.taxii.server.asserts;

import java.util.Objects;

import io.kangov.taxii.server.web.model.Envelop;
import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.internal.Iterables;

/**
 * {@link Envelop} specific assertions - Generated by CustomAssertionGenerator.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class EnvelopAssert extends AbstractObjectAssert<EnvelopAssert, Envelop> {

  /**
   * Creates a new <code>{@link EnvelopAssert}</code> to make assertions on actual Envelop.
   * @param actual the Envelop we want to make assertions on.
   */
  public EnvelopAssert(Envelop actual) {
    super(actual, EnvelopAssert.class);
  }

  /**
   * An entry point for EnvelopAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myEnvelop)</code> and get specific assertion with code completion.
   * @param actual the Envelop we want to make assertions on.
   * @return a new <code>{@link EnvelopAssert}</code>
   */
  @org.assertj.core.util.CheckReturnValue
  public static EnvelopAssert assertThat(Envelop actual) {
    return new EnvelopAssert(actual);
  }

  /**
   * Verifies that the actual Envelop's more is equal to the given one.
   * @param more the given more to compare the actual Envelop's more to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Envelop's more is not equal to the given one.
   */
  public EnvelopAssert hasMore(Boolean more) {
    // check that actual Envelop we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting more of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    Boolean actualMore = actual.getMore();
    if (!Objects.deepEquals(actualMore, more)) {
      failWithMessage(assertjErrorMessage, actual, more, actualMore);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Envelop's next is equal to the given one.
   * @param next the given next to compare the actual Envelop's next to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Envelop's next is not equal to the given one.
   */
  public EnvelopAssert hasNext(String next) {
    // check that actual Envelop we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting next of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualNext = actual.getNext();
    if (!Objects.deepEquals(actualNext, next)) {
      failWithMessage(assertjErrorMessage, actual, next, actualNext);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Envelop's objects contains the given Object elements.
   * @param objects the given elements that should be contained in actual Envelop's objects.
   * @return this assertion object.
   * @throws AssertionError if the actual Envelop's objects does not contain all given Object elements.
   */
  public EnvelopAssert hasObjects(Object... objects) {
    // check that actual Envelop we want to make assertions on is not null.
    isNotNull();

    // check that given Object varargs is not null.
    if (objects == null) failWithMessage("Expecting objects parameter not to be null.");

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getObjects(), objects);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Envelop's objects contains the given Object elements in Collection.
   * @param objects the given elements that should be contained in actual Envelop's objects.
   * @return this assertion object.
   * @throws AssertionError if the actual Envelop's objects does not contain all given Object elements.
   */
  public EnvelopAssert hasObjects(java.util.Collection<? extends Object> objects) {
    // check that actual Envelop we want to make assertions on is not null.
    isNotNull();

    // check that given Object collection is not null.
    if (objects == null) {
      failWithMessage("Expecting objects parameter not to be null.");
      return this; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getObjects(), objects.toArray());

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Envelop's objects contains <b>only</b> the given Object elements and nothing else in whatever order.
   * @param objects the given elements that should be contained in actual Envelop's objects.
   * @return this assertion object.
   * @throws AssertionError if the actual Envelop's objects does not contain all given Object elements.
   */
  public EnvelopAssert hasOnlyObjects(Object... objects) {
    // check that actual Envelop we want to make assertions on is not null.
    isNotNull();

    // check that given Object varargs is not null.
    if (objects == null) failWithMessage("Expecting objects parameter not to be null.");

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getObjects(), objects);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Envelop's objects contains <b>only</b> the given Object elements in Collection and nothing else in whatever order.
   * @param objects the given elements that should be contained in actual Envelop's objects.
   * @return this assertion object.
   * @throws AssertionError if the actual Envelop's objects does not contain all given Object elements.
   */
  public EnvelopAssert hasOnlyObjects(java.util.Collection<? extends Object> objects) {
    // check that actual Envelop we want to make assertions on is not null.
    isNotNull();

    // check that given Object collection is not null.
    if (objects == null) {
      failWithMessage("Expecting objects parameter not to be null.");
      return this; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getObjects(), objects.toArray());

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Envelop's objects does not contain the given Object elements.
   *
   * @param objects the given elements that should not be in actual Envelop's objects.
   * @return this assertion object.
   * @throws AssertionError if the actual Envelop's objects contains any given Object elements.
   */
  public EnvelopAssert doesNotHaveObjects(Object... objects) {
    // check that actual Envelop we want to make assertions on is not null.
    isNotNull();

    // check that given Object varargs is not null.
    if (objects == null) failWithMessage("Expecting objects parameter not to be null.");

    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getObjects(), objects);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Envelop's objects does not contain the given Object elements in Collection.
   *
   * @param objects the given elements that should not be in actual Envelop's objects.
   * @return this assertion object.
   * @throws AssertionError if the actual Envelop's objects contains any given Object elements.
   */
  public EnvelopAssert doesNotHaveObjects(java.util.Collection<? extends Object> objects) {
    // check that actual Envelop we want to make assertions on is not null.
    isNotNull();

    // check that given Object collection is not null.
    if (objects == null) {
      failWithMessage("Expecting objects parameter not to be null.");
      return this; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getObjects(), objects.toArray());

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Envelop has no objects.
   * @return this assertion object.
   * @throws AssertionError if the actual Envelop's objects is not empty.
   */
  public EnvelopAssert hasNoObjects() {
    // check that actual Envelop we want to make assertions on is not null.
    isNotNull();

    // we override the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have objects but had :\n  <%s>";

    // check
    if (actual.getObjects().iterator().hasNext()) {
      failWithMessage(assertjErrorMessage, actual, actual.getObjects());
    }

    // return the current assertion for method chaining
    return this;
  }


}