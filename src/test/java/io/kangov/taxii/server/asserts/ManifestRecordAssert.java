package io.kangov.taxii.server.asserts;

import java.util.Objects;

import io.kangov.taxii.server.web.model.ManifestRecord;
import org.assertj.core.api.AbstractObjectAssert;

/**
 * {@link ManifestRecord} specific assertions - Generated by CustomAssertionGenerator.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class ManifestRecordAssert extends AbstractObjectAssert<ManifestRecordAssert, ManifestRecord> {

  /**
   * Creates a new <code>{@link ManifestRecordAssert}</code> to make assertions on actual ManifestRecord.
   * @param actual the ManifestRecord we want to make assertions on.
   */
  public ManifestRecordAssert(ManifestRecord actual) {
    super(actual, ManifestRecordAssert.class);
  }

  /**
   * An entry point for ManifestRecordAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myManifestRecord)</code> and get specific assertion with code completion.
   * @param actual the ManifestRecord we want to make assertions on.
   * @return a new <code>{@link ManifestRecordAssert}</code>
   */
  @org.assertj.core.util.CheckReturnValue
  public static ManifestRecordAssert assertThat(ManifestRecord actual) {
    return new ManifestRecordAssert(actual);
  }

  /**
   * Verifies that the actual ManifestRecord's dateAdded is equal to the given one.
   * @param dateAdded the given dateAdded to compare the actual ManifestRecord's dateAdded to.
   * @return this assertion object.
   * @throws AssertionError - if the actual ManifestRecord's dateAdded is not equal to the given one.
   */
  public ManifestRecordAssert hasDateAdded(java.time.OffsetDateTime dateAdded) {
    // check that actual ManifestRecord we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting dateAdded of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    java.time.OffsetDateTime actualDateAdded = actual.getDateAdded();
    if (!Objects.deepEquals(actualDateAdded, dateAdded)) {
      failWithMessage(assertjErrorMessage, actual, dateAdded, actualDateAdded);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual ManifestRecord's id is equal to the given one.
   * @param id the given id to compare the actual ManifestRecord's id to.
   * @return this assertion object.
   * @throws AssertionError - if the actual ManifestRecord's id is not equal to the given one.
   */
  public ManifestRecordAssert hasId(java.util.UUID id) {
    // check that actual ManifestRecord we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting id of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    java.util.UUID actualId = actual.getId();
    if (!Objects.deepEquals(actualId, id)) {
      failWithMessage(assertjErrorMessage, actual, id, actualId);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual ManifestRecord's mediaType is equal to the given one.
   * @param mediaType the given mediaType to compare the actual ManifestRecord's mediaType to.
   * @return this assertion object.
   * @throws AssertionError - if the actual ManifestRecord's mediaType is not equal to the given one.
   */
  public ManifestRecordAssert hasMediaType(String mediaType) {
    // check that actual ManifestRecord we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting mediaType of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualMediaType = actual.getMediaType();
    if (!Objects.deepEquals(actualMediaType, mediaType)) {
      failWithMessage(assertjErrorMessage, actual, mediaType, actualMediaType);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual ManifestRecord's version is equal to the given one.
   * @param version the given version to compare the actual ManifestRecord's version to.
   * @return this assertion object.
   * @throws AssertionError - if the actual ManifestRecord's version is not equal to the given one.
   */
  public ManifestRecordAssert hasVersion(java.time.OffsetDateTime version) {
    // check that actual ManifestRecord we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting version of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    java.time.OffsetDateTime actualVersion = actual.getVersion();
    if (!Objects.deepEquals(actualVersion, version)) {
      failWithMessage(assertjErrorMessage, actual, version, actualVersion);
    }

    // return the current assertion for method chaining
    return this;
  }

}
