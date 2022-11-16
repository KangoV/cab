package io.kangov.taxii.server.asserts;

import java.util.Objects;

import io.kangov.taxii.server.web.model.Versions;
import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.internal.Iterables;

/**
 * {@link Versions} specific assertions - Generated by CustomAssertionGenerator.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class VersionsAssert extends AbstractObjectAssert<VersionsAssert, Versions> {

  /**
   * Creates a new <code>{@link VersionsAssert}</code> to make assertions on actual Versions.
   * @param actual the Versions we want to make assertions on.
   */
  public VersionsAssert(Versions actual) {
    super(actual, VersionsAssert.class);
  }

  /**
   * An entry point for VersionsAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myVersions)</code> and get specific assertion with code completion.
   * @param actual the Versions we want to make assertions on.
   * @return a new <code>{@link VersionsAssert}</code>
   */
  @org.assertj.core.util.CheckReturnValue
  public static VersionsAssert assertThat(Versions actual) {
    return new VersionsAssert(actual);
  }

  /**
   * Verifies that the actual Versions's more is equal to the given one.
   * @param more the given more to compare the actual Versions's more to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Versions's more is not equal to the given one.
   */
  public VersionsAssert hasMore(Boolean more) {
    // check that actual Versions we want to make assertions on is not null.
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
   * Verifies that the actual Versions's versions contains the given java.time.OffsetDateTime elements.
   * @param versions the given elements that should be contained in actual Versions's versions.
   * @return this assertion object.
   * @throws AssertionError if the actual Versions's versions does not contain all given java.time.OffsetDateTime elements.
   */
  public VersionsAssert hasVersions(java.time.OffsetDateTime... versions) {
    // check that actual Versions we want to make assertions on is not null.
    isNotNull();

    // check that given java.time.OffsetDateTime varargs is not null.
    if (versions == null) failWithMessage("Expecting versions parameter not to be null.");

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getVersions(), versions);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Versions's versions contains the given java.time.OffsetDateTime elements in Collection.
   * @param versions the given elements that should be contained in actual Versions's versions.
   * @return this assertion object.
   * @throws AssertionError if the actual Versions's versions does not contain all given java.time.OffsetDateTime elements.
   */
  public VersionsAssert hasVersions(java.util.Collection<? extends java.time.OffsetDateTime> versions) {
    // check that actual Versions we want to make assertions on is not null.
    isNotNull();

    // check that given java.time.OffsetDateTime collection is not null.
    if (versions == null) {
      failWithMessage("Expecting versions parameter not to be null.");
      return this; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getVersions(), versions.toArray());

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Versions's versions contains <b>only</b> the given java.time.OffsetDateTime elements and nothing else in whatever order.
   * @param versions the given elements that should be contained in actual Versions's versions.
   * @return this assertion object.
   * @throws AssertionError if the actual Versions's versions does not contain all given java.time.OffsetDateTime elements.
   */
  public VersionsAssert hasOnlyVersions(java.time.OffsetDateTime... versions) {
    // check that actual Versions we want to make assertions on is not null.
    isNotNull();

    // check that given java.time.OffsetDateTime varargs is not null.
    if (versions == null) failWithMessage("Expecting versions parameter not to be null.");

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getVersions(), versions);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Versions's versions contains <b>only</b> the given java.time.OffsetDateTime elements in Collection and nothing else in whatever order.
   * @param versions the given elements that should be contained in actual Versions's versions.
   * @return this assertion object.
   * @throws AssertionError if the actual Versions's versions does not contain all given java.time.OffsetDateTime elements.
   */
  public VersionsAssert hasOnlyVersions(java.util.Collection<? extends java.time.OffsetDateTime> versions) {
    // check that actual Versions we want to make assertions on is not null.
    isNotNull();

    // check that given java.time.OffsetDateTime collection is not null.
    if (versions == null) {
      failWithMessage("Expecting versions parameter not to be null.");
      return this; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getVersions(), versions.toArray());

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Versions's versions does not contain the given java.time.OffsetDateTime elements.
   *
   * @param versions the given elements that should not be in actual Versions's versions.
   * @return this assertion object.
   * @throws AssertionError if the actual Versions's versions contains any given java.time.OffsetDateTime elements.
   */
  public VersionsAssert doesNotHaveVersions(java.time.OffsetDateTime... versions) {
    // check that actual Versions we want to make assertions on is not null.
    isNotNull();

    // check that given java.time.OffsetDateTime varargs is not null.
    if (versions == null) failWithMessage("Expecting versions parameter not to be null.");

    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getVersions(), versions);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Versions's versions does not contain the given java.time.OffsetDateTime elements in Collection.
   *
   * @param versions the given elements that should not be in actual Versions's versions.
   * @return this assertion object.
   * @throws AssertionError if the actual Versions's versions contains any given java.time.OffsetDateTime elements.
   */
  public VersionsAssert doesNotHaveVersions(java.util.Collection<? extends java.time.OffsetDateTime> versions) {
    // check that actual Versions we want to make assertions on is not null.
    isNotNull();

    // check that given java.time.OffsetDateTime collection is not null.
    if (versions == null) {
      failWithMessage("Expecting versions parameter not to be null.");
      return this; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getVersions(), versions.toArray());

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Versions has no versions.
   * @return this assertion object.
   * @throws AssertionError if the actual Versions's versions is not empty.
   */
  public VersionsAssert hasNoVersions() {
    // check that actual Versions we want to make assertions on is not null.
    isNotNull();

    // we override the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have versions but had :\n  <%s>";

    // check
    if (actual.getVersions().iterator().hasNext()) {
      failWithMessage(assertjErrorMessage, actual, actual.getVersions());
    }

    // return the current assertion for method chaining
    return this;
  }


}