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

package io.kangov.taxii.server.controller;

import io.kangov.taxii.server.model.*;
import io.kangov.taxii.server.model.Status;
import io.micronaut.core.annotation.NonNull;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.micronaut.http.exceptions.HttpStatusException;
import reactor.core.publisher.Mono;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

@Controller
public class DefaultController {

    /**
     * Add a new object to a specific collection
     * This Endpoint adds objects to a Collection.
     *
     * @param apiRoot the base URL of the API Root (required)
     * @param collectionId the identifier of the Collection being requested (required)
     * @param envelop  (required)
     * @param accept  (optional, default to application/taxii+json;version=2.1)
     * @param contentType  (optional, default to application/taxii+json;version=2.1)
     * @return Envelop
     */
    @Post(uri="/{apiRoot}/collections/{collectionId}/objects")
    @Produces(value = {"application/taxii+json;version=2.1"})
    @Consumes(value = {"application/json"})
//    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<Envelop> addCollectionObjects(
      @PathVariable(value="apiRoot") @NonNull String apiRoot,
      @PathVariable(value="collectionId") @NonNull String collectionId,
      @Body @NotNull @Valid Envelop envelop,
      @Header(value="Accept", defaultValue="application/taxii+json;version=2.1") @Nullable String accept,
      @Header(value="Content-Type", defaultValue="application/taxii+json;version=2.1") @Nullable String contentType
    ) {
        // TODO implement addCollectionObjects();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }

    /**
     * Delete a specific object from a collection. This endpoint deletes an object from a Collection by its id. For
     * STIX 2 objects, the {object-id} MUST be the STIX id.
     *
     * @param apiRoot the base URL of the API Root (required)
     * @param collectionId the identifier of the Collection being requested (required)
     * @param objectId the ID of the object being deleted (required)
     * @param matchVersion the version(s) of an object (optional)
     * @param matchSpecVersion the specification version(s) (optional)
     * @param accept  (optional, default to application/taxii+json;version=2.1)
     */
    @Delete(uri="/{apiRoot}/collections/{collectionId}/objects/{objectId}}")
    @Produces(value = {"application/taxii+json;version=2.1"})
//    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<Void> deleteCollectionObject(
        @PathVariable(value="apiRoot") @NonNull String apiRoot,
        @PathVariable(value="collectionId") @NonNull String collectionId, 
        @PathVariable(value="objectId") @NonNull String objectId, 
        @QueryValue(value="match[version]") @Nullable List<String> matchVersion, 
        @QueryValue(value="match[spec_version]") @Nullable List<String> matchSpecVersion, 
        @Header(value="Accept", defaultValue="application/taxii+json;version=2.1") @Nullable String accept
    ) {
        // TODO implement deleteCollectionObject();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }

    /**
     * Get information about the TAXII Server and any advertised API Roots. This Endpoint provides general information
     * about a TAXII Server, including the advertised API Roots. It&#39;s a common entry point for TAXII Clients into
     * the data and services provided by a TAXII Server.
     *
     * @param accept  (optional, default to application/taxii+json;version=2.1)
     * @return Discovery
     */
    @Get(uri="/taxii2")
    @Produces(value = {"application/taxii+json;version=2.1"})
//    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<Discovery> discovery(
        @Header(value="Accept", defaultValue="application/taxii+json;version=2.1") @Nullable String accept
    ) {
        // TODO implement discovery();
        return Mono.just(Discovery.create(spec -> spec
            .contact("darren")
            .description("description")
            .addApiRoot("root")
            .title("title")
        ));
    }

    /**
     * Get information about a specific API Root. This Endpoint provides general information about an API Root, which
     * can be used to help users and clients decide whether and how they want to interact with it. Multiple API Roots
     * MAY be hosted on a single TAXII Server.  Often, an API Root represents a single trust group.
     *
     * @param apiRoot the base URL of the API Root (required)
     * @param accept  (optional, default to application/taxii+json;version=2.1)
     * @return ApiRoot
     */
    @Get(uri="/{apiRoot}")
    @Produces(value = {"application/taxii+json;version=2.1"})
//    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<ApiRoot> getApiRoot(
        @PathVariable(value="apiRoot") @NonNull String apiRoot, 
        @Header(value="Accept", defaultValue="application/taxii+json;version=2.1") @Nullable String accept
    ) {
        // TODO implement getApiRoot();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }

    /**
     * Get information about a specific collection. This Endpoint provides general information about a Collection,
     * which can be used to help users and clients decide whether and how they want to interact with it. For example,
     * it will tell clients what it&#39;s called and what permissions they have to it.
     *
     * @param apiRoot the base URL of the API Root (required)
     * @param collectionId the identifier of the Collection being requested (required)
     * @param accept  (optional, default to application/taxii+json;version=2.1)
     * @return Collections
     */
    @Get(uri="/{apiRoot}/collections/{collectionId}")
    @Produces(value = {"application/taxii+json;version=2.1"})
//    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<Collections> getCollection(
        @PathVariable(value="apiRoot") @NonNull String apiRoot, 
        @PathVariable(value="collectionId") @NonNull String collectionId, 
        @Header(value="Accept", defaultValue="application/taxii+json;version=2.1") @Nullable String accept
    ) {
        // TODO implement getCollection();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }

    /**
     * Get manifest information about the contents of a specific collection. This Endpoint retrieves a manifest about
     * the objects in a Collection. It supports filtering identical to the get objects Endpoint but rather than
     * returning the object itself it returns metadata about the object. It can be used to retrieve metadata to decide
     * whether it&#39;s worth retrieving the actual objects.
     *
     * @param apiRoot the base URL of the API Root (required)
     * @param collectionId the identifier of the Collection being requested (required)
     * @param addedAfter a single timestamp (optional)
     * @param limit a single integer (optional)
     * @param next a single string (optional)
     * @param matchId an id(s) of an object (optional)
     * @param matchType the type(s) of an object (optional)
     * @param matchVersion the version(s) of an object (optional)
     * @param matchSpecVersion the specification version(s) (optional)
     * @param accept  (optional, default to application/taxii+json;version=2.1)
     * @return Manifest
     */
    @Get(uri="/{apiRoot}/collections/{collectionId}/manifest")
    @Produces(value = {"application/taxii+json;version=2.1"})
//    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<Manifest> getCollectionManifest(
        @PathVariable(value="apiRoot") @NonNull String apiRoot, 
        @PathVariable(value="collectionId") @NonNull String collectionId, 
        @QueryValue(value="added_after") @Nullable String addedAfter, 
        @QueryValue(value="limit") @Nullable Integer limit, 
        @QueryValue(value="next") @Nullable String next, 
        @QueryValue(value="match[id]") @Nullable List<String> matchId, 
        @QueryValue(value="match[type]") @Nullable List<String> matchType, 
        @QueryValue(value="match[version]") @Nullable List<String> matchVersion, 
        @QueryValue(value="match[spec_version]") @Nullable List<String> matchSpecVersion, 
        @Header(value="Accept", defaultValue="application/taxii+json;version=2.1") @Nullable String accept
    ) {
        // TODO implement getCollectionManifest();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }

    /**
     * Get a specific object from a collection. This Endpoint gets an object from a Collection by its id. It can be
     * thought of as a search where the match[id] parameter is set to the {objectId} in the path. For STIX 2 objects,
     * the {objectId} MUST be the STIX id.
     *
     * @param apiRoot the base URL of the API Root (required)
     * @param collectionId the identifier of the Collection being requested (required)
     * @param objectId the ID of the object being requested (required)
     * @param addedAfter a single timestamp (optional)
     * @param limit a single integer (optional)
     * @param next a single string (optional)
     * @param matchVersion the version(s) of an object (optional)
     * @param matchSpecVersion the specification version(s) (optional)
     * @param accept  (optional, default to application/taxii+json;version=2.1)
     * @return Envelop
     */
    @Get(uri="/{apiRoot}/collections/{collectionId}/objects/{objectId}")
    @Produces(value = {"application/taxii+json;version=2.1"})
//    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<Envelop> getCollectionObject(
        @PathVariable(value="apiRoot") @NonNull String apiRoot, 
        @PathVariable(value="collectionId") @NonNull String collectionId, 
        @PathVariable(value="objectId") @NonNull String objectId, 
        @QueryValue(value="added_after") @Nullable String addedAfter, 
        @QueryValue(value="limit") @Nullable Integer limit, 
        @QueryValue(value="next") @Nullable String next, 
        @QueryValue(value="match[version]") @Nullable List<String> matchVersion, 
        @QueryValue(value="match[spec_version]") @Nullable List<String> matchSpecVersion, 
        @Header(value="Accept", defaultValue="application/taxii+json;version=2.1") @Nullable String accept
    ) {
        // TODO implement getCollectionObject();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }

    /**
     * Get a list of object versions from a collection. This Endpoint retrieves a list of one or more versions of an
     * object in a Collection. This list can be used to decide whether it&#39;s worth retrieving the actual objects, or
     * if new versions have been added. If a STIX object is not versioned (and therefore does not have a modified
     * timestamp), the server MUST use created timestamp.
     *
     * @param apiRoot the base URL of the API Root (required)
     * @param collectionId the identifier of the Collection being requested (required)
     * @param objectId the ID of the object being requested (required)
     * @param addedAfter a single timestamp (optional)
     * @param limit a single integer (optional)
     * @param next a single string (optional)
     * @param matchSpecVersion the specification version(s) (optional)
     * @param accept  (optional, default to application/taxii+json;version=2.1)
     * @return Versions
     */
    @Get(uri="/{apiRoot}/collections/{collectionId}/objects/{objectId}/versions")
    @Produces(value = {"application/taxii+json;version=2.1"})
//    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<Versions> getCollectionObjectVersions(
        @PathVariable(value="apiRoot") @NonNull String apiRoot, 
        @PathVariable(value="collectionId") @NonNull String collectionId, 
        @PathVariable(value="objectId") @NonNull String objectId, 
        @QueryValue(value="added_after") @Nullable String addedAfter, 
        @QueryValue(value="limit") @Nullable Integer limit, 
        @QueryValue(value="next") @Nullable String next, 
        @QueryValue(value="match[spec_version]") @Nullable List<String> matchSpecVersion, 
        @Header(value="Accept", defaultValue="application/taxii+json;version=2.1") @Nullable String accept
    ) {
        // TODO implement getCollectionObjectVersions();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }

    /**
     * Get all objects from a collection. This Endpoint retrieves objects from a Collection. Clients can search for
     * objects in the Collection, retrieve all objects in a Collection, or paginate through objects in the Collection.
     *
     * @param apiRoot the base URL of the API Root (required)
     * @param collectionId the identifier of the Collection being requested (required)
     * @param addedAfter a single timestamp (optional)
     * @param limit a single integer (optional)
     * @param next a single string (optional)
     * @param matchId an id(s) of an object (optional)
     * @param matchType the type(s) of an object (optional)
     * @param matchVersion the version(s) of an object (optional)
     * @param matchSpecVersion the specification version(s) (optional)
     * @param accept  (optional, default to application/taxii+json;version=2.1)
     * @return Envelop
     */
    @Get(uri="/{apiRoot}/collections/{collectionId}/objects")
    @Produces(value = {"application/taxii+json;version=2.1"})
//    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<Envelop> getCollectionObjects(
        @PathVariable(value="apiRoot") @NonNull String apiRoot, 
        @PathVariable(value="collectionId") @NonNull String collectionId, 
        @QueryValue(value="added_after") @Nullable String addedAfter, 
        @QueryValue(value="limit") @Nullable Integer limit, 
        @QueryValue(value="next") @Nullable String next, 
        @QueryValue(value="match[id]") @Nullable List<String> matchId, 
        @QueryValue(value="match[type]") @Nullable List<String> matchType, 
        @QueryValue(value="match[version]") @Nullable List<String> matchVersion, 
        @QueryValue(value="match[spec_version]") @Nullable List<String> matchSpecVersion, 
        @Header(value="Accept", defaultValue="application/taxii+json;version=2.1") @Nullable String accept
    ) {
        // TODO implement getCollectionObjects();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }

    /**
     * Get information about all collections
     * This endpoint provides information about the Collections hosted under this API Root. This is similar to the response to get a Collection, but rather than providing information about one Collection it provides information about all of the Collections. Most importantly, it provides the Collection&#39;s id, which is used to request objects or manifest entries from the Collection.
     *
     * @param apiRoot the base URL of the API Root (required)
     * @param accept  (optional, default to application/taxii+json;version=2.1)
     * @return Collections
     */
    @Get(uri="/{apiRoot}/collections")
    @Produces(value = {"application/taxii+json;version=2.1"})
//    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<Collections> getCollections(
        @PathVariable(value="apiRoot") @NonNull String apiRoot, 
        @Header(value="Accept", defaultValue="application/taxii+json;version=2.1") @Nullable String accept
    ) {
        // TODO implement getCollections();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }

    /**
     * Get status information for a specific status ID
     * This Endpoint provides information about the status of a previous request. In TAXII 2.1, the only request that can be monitored is one to add objects to a Collection. It is typically used by TAXII Clients to monitor a POST request that they made in order to take action when it is complete.
     *
     * @param apiRoot the base URL of the API Root (required)
     * @param statusId the identifier of the status message being requested (required)
     * @param accept  (optional, default to application/taxii+json;version=2.1)
     * @return Status
     */
    @Get(uri="/{apiRoot}/status/{statusId}")
    @Produces(value = {"application/taxii+json;version=2.1"})
//    @Secured({SecurityRule.IS_AUTHENTICATED})
    public Mono<Status> getStatus(
        @PathVariable(value="apiRoot") @NonNull String apiRoot, 
        @PathVariable(value="statusId") @NonNull String statusId, 
        @Header(value="Accept", defaultValue="application/taxii+json;version=2.1") @Nullable String accept
    ) {
        // TODO implement getStatus();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }

}