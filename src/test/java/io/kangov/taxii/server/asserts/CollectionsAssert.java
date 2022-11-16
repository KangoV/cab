package io.kangov.taxii.server.asserts;

import io.kangov.taxii.server.web.model.Collection;
import io.kangov.taxii.server.web.model.Collections;
import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.internal.Iterables;

/**
 * {@link Collections} specific assertions - Generated by CustomAssertionGenerator.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class CollectionsAssert extends AbstractObjectAssert<CollectionsAssert, Collections> {

  /**
   * Creates a new <code>{@link CollectionsAssert}</code> to make assertions on actual Collections.
   * @param actual the Collections we want to make assertions on.
   */
  public CollectionsAssert(Collections actual) {
    super(actual, CollectionsAssert.class);
  }

  /**
   * An entry point for CollectionsAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myCollections)</code> and get specific assertion with code completion.
   * @param actual the Collections we want to make assertions on.
   * @return a new <code>{@link CollectionsAssert}</code>
   */
  @org.assertj.core.util.CheckReturnValue
  public static CollectionsAssert assertThat(Collections actual) {
    return new CollectionsAssert(actual);
  }

  /**
   * Verifies that the actual Collections's collections contains the given Collection elements.
   * @param collections the given elements that should be contained in actual Collections's collections.
   * @return this assertion object.
   * @throws AssertionError if the actual Collections's collections does not contain all given Collection elements.
   */
  public CollectionsAssert hasCollections(Collection... collections) {
    // check that actual Collections we want to make assertions on is not null.
    isNotNull();

    // check that given Collection varargs is not null.
    if (collections == null) failWithMessage("Expecting collections parameter not to be null.");

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getCollections(), collections);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Collections's collections contains the given Collection elements in Collection.
   * @param collections the given elements that should be contained in actual Collections's collections.
   * @return this assertion object.
   * @throws AssertionError if the actual Collections's collections does not contain all given Collection elements.
   */
  public CollectionsAssert hasCollections(java.util.Collection<? extends Collection> collections) {
    // check that actual Collections we want to make assertions on is not null.
    isNotNull();

    // check that given Collection collection is not null.
    if (collections == null) {
      failWithMessage("Expecting collections parameter not to be null.");
      return this; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getCollections(), collections.toArray());

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Collections's collections contains <b>only</b> the given Collection elements and nothing else in whatever order.
   * @param collections the given elements that should be contained in actual Collections's collections.
   * @return this assertion object.
   * @throws AssertionError if the actual Collections's collections does not contain all given Collection elements.
   */
  public CollectionsAssert hasOnlyCollections(Collection... collections) {
    // check that actual Collections we want to make assertions on is not null.
    isNotNull();

    // check that given Collection varargs is not null.
    if (collections == null) failWithMessage("Expecting collections parameter not to be null.");

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getCollections(), collections);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Collections's collections contains <b>only</b> the given Collection elements in Collection and nothing else in whatever order.
   * @param collections the given elements that should be contained in actual Collections's collections.
   * @return this assertion object.
   * @throws AssertionError if the actual Collections's collections does not contain all given Collection elements.
   */
  public CollectionsAssert hasOnlyCollections(java.util.Collection<? extends Collection> collections) {
    // check that actual Collections we want to make assertions on is not null.
    isNotNull();

    // check that given Collection collection is not null.
    if (collections == null) {
      failWithMessage("Expecting collections parameter not to be null.");
      return this; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getCollections(), collections.toArray());

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Collections's collections does not contain the given Collection elements.
   *
   * @param collections the given elements that should not be in actual Collections's collections.
   * @return this assertion object.
   * @throws AssertionError if the actual Collections's collections contains any given Collection elements.
   */
  public CollectionsAssert doesNotHaveCollections(Collection... collections) {
    // check that actual Collections we want to make assertions on is not null.
    isNotNull();

    // check that given Collection varargs is not null.
    if (collections == null) failWithMessage("Expecting collections parameter not to be null.");

    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getCollections(), collections);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Collections's collections does not contain the given Collection elements in Collection.
   *
   * @param collections the given elements that should not be in actual Collections's collections.
   * @return this assertion object.
   * @throws AssertionError if the actual Collections's collections contains any given Collection elements.
   */
  public CollectionsAssert doesNotHaveCollections(java.util.Collection<? extends Collection> collections) {
    // check that actual Collections we want to make assertions on is not null.
    isNotNull();

    // check that given Collection collection is not null.
    if (collections == null) {
      failWithMessage("Expecting collections parameter not to be null.");
      return this; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getCollections(), collections.toArray());

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Collections has no collections.
   * @return this assertion object.
   * @throws AssertionError if the actual Collections's collections is not empty.
   */
  public CollectionsAssert hasNoCollections() {
    // check that actual Collections we want to make assertions on is not null.
    isNotNull();

    // we override the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have collections but had :\n  <%s>";

    // check
    if (actual.getCollections().iterator().hasNext()) {
      failWithMessage(assertjErrorMessage, actual, actual.getCollections());
    }

    // return the current assertion for method chaining
    return this;
  }


}
