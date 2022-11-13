package io.kangov.taxii.server.controller;

import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;


/**
 * API tests for DefaultController
 */
@MicronautTest
public class DefaultControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    DefaultController controller;

//    /**
//     * This test is used to validate the implementation of addCollectionObjects() method
//     *
//     * The method should: Add a new object to a specific collection
//     *
//     * This Endpoint adds objects to a Collection.
//     *
//     * TODO fill in the parameters and test return value.
//     */
//    @Test
//    @Disabled("Not Implemented")
//    void addCollectionObjectsMethodTest() {
//        // given
//        String apiRoot = "example";
//        String collectionId = "example";
//        Envelop envelop = Envelopnew Envelop();
//        String accept = "application/taxii+json;version=2.1";
//        String contentType = "application/taxii+json;version=2.1";
//
//        // when
//        Envelop result = controller.addCollectionObjects(apiRoot, collectionId, envelop, accept, contentType).block();
//
//        // then
//        Assertions.assertTrue(true);
//    }
//
//    /**
//     * This test is used to check that the api available to client through
//     * '/{apiRoot}/collections/{collectionId}/objects' to the features of addCollectionObjects() works as desired.
//     *
//     * TODO fill in the request parameters and test response.
//     */
//    @Test
//    @Disabled("Not Implemented")
//    void addCollectionObjectsClientApiTest() throws IOException {
//        // given
//        Envelop body = new Envelop();
//        String uri = UriTemplate.of("/{apiRoot}/collections/{collectionId}/objects").expand(new HashMap<String, Object>(){{
//            // Fill in the path variables
//            put("apiRoot", "example");
//            put("collectionId", "example");
//        }});
//        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
//            .accept("application/taxii+json;version&#x3D;2.1")
//            .header("Accept", "application/taxii+json;version=2.1")
//            .header("Content-Type", "application/taxii+json;version=2.1");
//
//        // when
//        HttpResponse<?> response = client.toBlocking().exchange(request, Envelop.class);
//
//        // then
//        Assertions.assertEquals(HttpStatus.OK, response.status());
//    }
//
//    /**
//     * This test is used to validate the implementation of deleteCollectionObject() method
//     *
//     * The method should: Delete a specific object from a collection
//     *
//     * This endpoint deletes an object from a Collection by its id. For STIX 2 objects, the {object-id} MUST be the STIX id.
//     *
//     * TODO fill in the parameters and test return value.
//     */
//    @Test
//    @Disabled("Not Implemented")
//    void deleteCollectionObjectMethodTest() {
//        // given
//        String apiRoot = "example";
//        String collectionId = "example";
//        String objectId = "example";
//        List<String> matchVersion = Arrays.asList("example");
//        List<String> matchSpecVersion = Arrays.asList("example");
//        String accept = "application/taxii+json;version=2.1";
//
//        // when
//        controller.deleteCollectionObject(apiRoot, collectionId, objectId, matchVersion, matchSpecVersion, accept).block();
//
//        // then
//        Assertions.assertTrue(true);
//    }
//
//    /**
//     * This test is used to check that the api available to client through
//     * '/{apiRoot}/collections/{collectionId}/objects/{objectId}}' to the features of deleteCollectionObject() works as desired.
//     *
//     * TODO fill in the request parameters and test response.
//     */
//    @Test
//    @Disabled("Not Implemented")
//    void deleteCollectionObjectClientApiTest() throws IOException {
//        // given
//        String uri = UriTemplate.of("/{apiRoot}/collections/{collectionId}/objects/{objectId}}").expand(new HashMap<String, Object>(){{
//            // Fill in the path variables
//            put("apiRoot", "example");
//            put("collectionId", "example");
//            put("objectId", "example");
//        }});
//        MutableHttpRequest<?> request = HttpRequest.DELETE(uri)
//            .accept("application/taxii+json;version&#x3D;2.1")
//            .header("Accept", "application/taxii+json;version=2.1");
//        request.getParameters()
//            .add("match[version]", Arrays.asList("example")) // The query format should be multi
//            .add("match[spec_version]", Arrays.asList("example")); // The query format should be multi
//
//        // when
//        HttpResponse<?> response = client.toBlocking().exchange(request); // To retrieve body you must specify required type (e.g. Map.class) as second argument
//
//        // then
//        Assertions.assertEquals(HttpStatus.OK, response.status());
//    }
//
//    /**
//     * This test is used to validate the implementation of discovery() method
//     *
//     * The method should: Get information about the TAXII Server and any advertised API Roots
//     *
//     * This Endpoint provides general information about a TAXII Server, including the advertised API Roots. It&#39;s a common entry point for TAXII Clients into the data and services provided by a TAXII Server.
//     *
//     * TODO fill in the parameters and test return value.
//     */
//    @Test
//    @Disabled("Not Implemented")
//    void discoveryMethodTest() {
//        // given
//        String accept = "application/taxii+json;version=2.1";
//
//        // when
//        Discovery result = controller.discovery(accept).block();
//
//        // then
//        Assertions.assertTrue(true);
//    }
//
//    /**
//     * This test is used to check that the api available to client through
//     * '/taxii2' to the features of discovery() works as desired.
//     *
//     * TODO fill in the request parameters and test response.
//     */
//    @Test
//    @Disabled("Not Implemented")
//    void discoveryClientApiTest() throws IOException {
//        // given
//        String uri = UriTemplate.of("/taxii2").expand(new HashMap<>());
//        MutableHttpRequest<?> request = HttpRequest.GET(uri)
//            .accept("application/taxii+json;version&#x3D;2.1")
//            .header("Accept", "application/taxii+json;version=2.1");
//
//        // when
//        HttpResponse<?> response = client.toBlocking().exchange(request, Discovery.class);
//
//        // then
//        Assertions.assertEquals(HttpStatus.OK, response.status());
//    }
//
//    /**
//     * This test is used to validate the implementation of getApiRoot() method
//     *
//     * The method should: Get information about a specific API Root
//     *
//     * This Endpoint provides general information about an API Root, which can be used to help users and clients decide whether and how they want to interact with it. Multiple API Roots MAY be hosted on a single TAXII Server.  Often, an API Root represents a single trust group.
//     *
//     * TODO fill in the parameters and test return value.
//     */
//    @Test
//    @Disabled("Not Implemented")
//    void getApiRootMethodTest() {
//        // given
//        String apiRoot = "example";
//        String accept = "application/taxii+json;version=2.1";
//
//        // when
//        ApiRoot result = controller.getApiRoot(apiRoot, accept).block();
//
//        // then
//        Assertions.assertTrue(true);
//    }
//
//    /**
//     * This test is used to check that the api available to client through
//     * '/{apiRoot}' to the features of getApiRoot() works as desired.
//     *
//     * TODO fill in the request parameters and test response.
//     */
//    @Test
//    @Disabled("Not Implemented")
//    void getApiRootClientApiTest() throws IOException {
//        // given
//        String uri = UriTemplate.of("/{apiRoot}").expand(new HashMap<String, Object>(){{
//            // Fill in the path variables
//            put("apiRoot", "example");
//        }});
//        MutableHttpRequest<?> request = HttpRequest.GET(uri)
//            .accept("application/taxii+json;version&#x3D;2.1")
//            .header("Accept", "application/taxii+json;version=2.1");
//
//        // when
//        HttpResponse<?> response = client.toBlocking().exchange(request, ApiRoot.class);
//
//        // then
//        Assertions.assertEquals(HttpStatus.OK, response.status());
//    }
//
//    /**
//     * This test is used to validate the implementation of getCollection() method
//     *
//     * The method should: Get information about a specific collection
//     *
//     * This Endpoint provides general information about a Collection, which can be used to help users and clients decide whether and how they want to interact with it. For example, it will tell clients what it&#39;s called and what permissions they have to it.
//     *
//     * TODO fill in the parameters and test return value.
//     */
//    @Test
//    @Disabled("Not Implemented")
//    void getCollectionMethodTest() {
//        // given
//        String apiRoot = "example";
//        String collectionId = "example";
//        String accept = "application/taxii+json;version=2.1";
//
//        // when
//        Collections result = controller.getCollection(apiRoot, collectionId, accept).block();
//
//        // then
//        Assertions.assertTrue(true);
//    }
//
//    /**
//     * This test is used to check that the api available to client through
//     * '/{apiRoot}/collections/{collectionId}' to the features of getCollection() works as desired.
//     *
//     * TODO fill in the request parameters and test response.
//     */
//    @Test
//    @Disabled("Not Implemented")
//    void getCollectionClientApiTest() throws IOException {
//        // given
//        String uri = UriTemplate.of("/{apiRoot}/collections/{collectionId}").expand(new HashMap<String, Object>(){{
//            // Fill in the path variables
//            put("apiRoot", "example");
//            put("collectionId", "example");
//        }});
//        MutableHttpRequest<?> request = HttpRequest.GET(uri)
//            .accept("application/taxii+json;version&#x3D;2.1")
//            .header("Accept", "application/taxii+json;version=2.1");
//
//        // when
//        HttpResponse<?> response = client.toBlocking().exchange(request, Collections.class);
//
//        // then
//        Assertions.assertEquals(HttpStatus.OK, response.status());
//    }
//
//    /**
//     * This test is used to validate the implementation of getCollectionManifest() method
//     *
//     * The method should: Get manifest information about the contents of a specific collection
//     *
//     * This Endpoint retrieves a manifest about the objects in a Collection. It supports filtering identical to the get objects Endpoint but rather than returning the object itself it returns metadata about the object. It can be used to retrieve metadata to decide whether it&#39;s worth retrieving the actual objects.
//     *
//     * TODO fill in the parameters and test return value.
//     */
//    @Test
//    @Disabled("Not Implemented")
//    void getCollectionManifestMethodTest() {
//        // given
//        String apiRoot = "example";
//        String collectionId = "example";
//        String addedAfter = "example";
//        Integer limit = 56;
//        String next = "example";
//        List<String> matchId = Arrays.asList("example");
//        List<String> matchType = Arrays.asList("example");
//        List<String> matchVersion = Arrays.asList("example");
//        List<String> matchSpecVersion = Arrays.asList("example");
//        String accept = "application/taxii+json;version=2.1";
//
//        // when
//        Manifest result = controller.getCollectionManifest(apiRoot, collectionId, addedAfter, limit, next, matchId, matchType, matchVersion, matchSpecVersion, accept).block();
//
//        // then
//        Assertions.assertTrue(true);
//    }
//
//    /**
//     * This test is used to check that the api available to client through
//     * '/{apiRoot}/collections/{collectionId}/manifest' to the features of getCollectionManifest() works as desired.
//     *
//     * TODO fill in the request parameters and test response.
//     */
//    @Test
//    @Disabled("Not Implemented")
//    void getCollectionManifestClientApiTest() throws IOException {
//        // given
//        String uri = UriTemplate.of("/{apiRoot}/collections/{collectionId}/manifest").expand(new HashMap<String, Object>(){{
//            // Fill in the path variables
//            put("apiRoot", "example");
//            put("collectionId", "example");
//        }});
//        MutableHttpRequest<?> request = HttpRequest.GET(uri)
//            .accept("application/taxii+json;version&#x3D;2.1")
//            .header("Accept", "application/taxii+json;version=2.1");
//        request.getParameters()
//            .add("added_after", "example") // The query parameter format should be
//            .add("limit", String.valueOf(56)) // The query parameter format should be
//            .add("next", "example") // The query parameter format should be
//            .add("match[id]", Arrays.asList("example")) // The query format should be multi
//            .add("match[type]", Arrays.asList("example")) // The query format should be multi
//            .add("match[version]", Arrays.asList("example")) // The query format should be multi
//            .add("match[spec_version]", Arrays.asList("example")); // The query format should be multi
//
//        // when
//        HttpResponse<?> response = client.toBlocking().exchange(request, Manifest.class);
//
//        // then
//        Assertions.assertEquals(HttpStatus.OK, response.status());
//    }
//
//    /**
//     * This test is used to validate the implementation of getCollectionObject() method
//     *
//     * The method should: Get a specific object from a collection
//     *
//     * This Endpoint gets an object from a Collection by its id. It can be thought of as a search where the match[id] parameter is set to the {objectId} in the path. For STIX 2 objects, the {objectId} MUST be the STIX id.
//     *
//     * TODO fill in the parameters and test return value.
//     */
//    @Test
//    @Disabled("Not Implemented")
//    void getCollectionObjectMethodTest() {
//        // given
//        String apiRoot = "example";
//        String collectionId = "example";
//        String objectId = "example";
//        String addedAfter = "example";
//        Integer limit = 56;
//        String next = "example";
//        List<String> matchVersion = Arrays.asList("example");
//        List<String> matchSpecVersion = Arrays.asList("example");
//        String accept = "application/taxii+json;version=2.1";
//
//        // when
//        Envelop result = controller.getCollectionObject(apiRoot, collectionId, objectId, addedAfter, limit, next, matchVersion, matchSpecVersion, accept).block();
//
//        // then
//        Assertions.assertTrue(true);
//    }
//
//    /**
//     * This test is used to check that the api available to client through
//     * '/{apiRoot}/collections/{collectionId}/objects/{objectId}' to the features of getCollectionObject() works as desired.
//     *
//     * TODO fill in the request parameters and test response.
//     */
//    @Test
//    @Disabled("Not Implemented")
//    void getCollectionObjectClientApiTest() throws IOException {
//        // given
//        String uri = UriTemplate.of("/{apiRoot}/collections/{collectionId}/objects/{objectId}").expand(new HashMap<String, Object>(){{
//            // Fill in the path variables
//            put("apiRoot", "example");
//            put("collectionId", "example");
//            put("objectId", "example");
//        }});
//        MutableHttpRequest<?> request = HttpRequest.GET(uri)
//            .accept("application/taxii+json;version&#x3D;2.1")
//            .header("Accept", "application/taxii+json;version=2.1");
//        request.getParameters()
//            .add("added_after", "example") // The query parameter format should be
//            .add("limit", String.valueOf(56)) // The query parameter format should be
//            .add("next", "example") // The query parameter format should be
//            .add("match[version]", Arrays.asList("example")) // The query format should be multi
//            .add("match[spec_version]", Arrays.asList("example")); // The query format should be multi
//
//        // when
//        HttpResponse<?> response = client.toBlocking().exchange(request, Envelop.class);
//
//        // then
//        Assertions.assertEquals(HttpStatus.OK, response.status());
//    }
//
//    /**
//     * This test is used to validate the implementation of getCollectionObjectVersions() method
//     *
//     * The method should: Get a list of object versions from a collection
//     *
//     * This Endpoint retrieves a list of one or more versions of an object in a Collection. This list can be used to decide whether it&#39;s worth retrieving the actual objects, or if new versions have been added. If a STIX object is not versioned (and therefore does not have a modified timestamp), the server MUST use created timestamp.
//     *
//     * TODO fill in the parameters and test return value.
//     */
//    @Test
//    @Disabled("Not Implemented")
//    void getCollectionObjectVersionsMethodTest() {
//        // given
//        String apiRoot = "example";
//        String collectionId = "example";
//        String objectId = "example";
//        String addedAfter = "example";
//        Integer limit = 56;
//        String next = "example";
//        List<String> matchSpecVersion = Arrays.asList("example");
//        String accept = "application/taxii+json;version=2.1";
//
//        // when
//        Versions result = controller.getCollectionObjectVersions(apiRoot, collectionId, objectId, addedAfter, limit, next, matchSpecVersion, accept).block();
//
//        // then
//        Assertions.assertTrue(true);
//    }
//
//    /**
//     * This test is used to check that the api available to client through
//     * '/{apiRoot}/collections/{collectionId}/objects/{objectId}/versions' to the features of getCollectionObjectVersions() works as desired.
//     *
//     * TODO fill in the request parameters and test response.
//     */
//    @Test
//    @Disabled("Not Implemented")
//    void getCollectionObjectVersionsClientApiTest() throws IOException {
//        // given
//        String uri = UriTemplate.of("/{apiRoot}/collections/{collectionId}/objects/{objectId}/versions").expand(new HashMap<String, Object>(){{
//            // Fill in the path variables
//            put("apiRoot", "example");
//            put("collectionId", "example");
//            put("objectId", "example");
//        }});
//        MutableHttpRequest<?> request = HttpRequest.GET(uri)
//            .accept("application/taxii+json;version&#x3D;2.1")
//            .header("Accept", "application/taxii+json;version=2.1");
//        request.getParameters()
//            .add("added_after", "example") // The query parameter format should be
//            .add("limit", String.valueOf(56)) // The query parameter format should be
//            .add("next", "example") // The query parameter format should be
//            .add("match[spec_version]", Arrays.asList("example")); // The query format should be multi
//
//        // when
//        HttpResponse<?> response = client.toBlocking().exchange(request, Versions.class);
//
//        // then
//        Assertions.assertEquals(HttpStatus.OK, response.status());
//    }
//
//    /**
//     * This test is used to validate the implementation of getCollectionObjects() method
//     *
//     * The method should: Get all objects from a collection
//     *
//     * This Endpoint retrieves objects from a Collection. Clients can search for objects in the Collection, retrieve all objects in a Collection, or paginate through objects in the Collection.
//     *
//     * TODO fill in the parameters and test return value.
//     */
//    @Test
//    @Disabled("Not Implemented")
//    void getCollectionObjectsMethodTest() {
//        // given
//        String apiRoot = "example";
//        String collectionId = "example";
//        String addedAfter = "example";
//        Integer limit = 56;
//        String next = "example";
//        List<String> matchId = Arrays.asList("example");
//        List<String> matchType = Arrays.asList("example");
//        List<String> matchVersion = Arrays.asList("example");
//        List<String> matchSpecVersion = Arrays.asList("example");
//        String accept = "application/taxii+json;version=2.1";
//
//        // when
//        Envelop result = controller.getCollectionObjects(apiRoot, collectionId, addedAfter, limit, next, matchId, matchType, matchVersion, matchSpecVersion, accept).block();
//
//        // then
//        Assertions.assertTrue(true);
//    }
//
//    /**
//     * This test is used to check that the api available to client through
//     * '/{apiRoot}/collections/{collectionId}/objects' to the features of getCollectionObjects() works as desired.
//     *
//     * TODO fill in the request parameters and test response.
//     */
//    @Test
//    @Disabled("Not Implemented")
//    void getCollectionObjectsClientApiTest() throws IOException {
//        // given
//        String uri = UriTemplate.of("/{apiRoot}/collections/{collectionId}/objects").expand(new HashMap<String, Object>(){{
//            // Fill in the path variables
//            put("apiRoot", "example");
//            put("collectionId", "example");
//        }});
//        MutableHttpRequest<?> request = HttpRequest.GET(uri)
//            .accept("application/taxii+json;version&#x3D;2.1")
//            .header("Accept", "application/taxii+json;version=2.1");
//        request.getParameters()
//            .add("added_after", "example") // The query parameter format should be
//            .add("limit", String.valueOf(56)) // The query parameter format should be
//            .add("next", "example") // The query parameter format should be
//            .add("match[id]", Arrays.asList("example")) // The query format should be multi
//            .add("match[type]", Arrays.asList("example")) // The query format should be multi
//            .add("match[version]", Arrays.asList("example")) // The query format should be multi
//            .add("match[spec_version]", Arrays.asList("example")); // The query format should be multi
//
//        // when
//        HttpResponse<?> response = client.toBlocking().exchange(request, Envelop.class);
//
//        // then
//        Assertions.assertEquals(HttpStatus.OK, response.status());
//    }
//
//    /**
//     * This test is used to validate the implementation of getCollections() method
//     *
//     * The method should: Get information about all collections
//     *
//     * This endpoint provides information about the Collections hosted under this API Root. This is similar to the response to get a Collection, but rather than providing information about one Collection it provides information about all of the Collections. Most importantly, it provides the Collection&#39;s id, which is used to request objects or manifest entries from the Collection.
//     *
//     * TODO fill in the parameters and test return value.
//     */
//    @Test
//    @Disabled("Not Implemented")
//    void getCollectionsMethodTest() {
//        // given
//        String apiRoot = "example";
//        String accept = "application/taxii+json;version=2.1";
//
//        // when
//        Collections result = controller.getCollections(apiRoot, accept).block();
//
//        // then
//        Assertions.assertTrue(true);
//    }
//
//    /**
//     * This test is used to check that the api available to client through
//     * '/{apiRoot}/collections' to the features of getCollections() works as desired.
//     *
//     * TODO fill in the request parameters and test response.
//     */
//    @Test
//    @Disabled("Not Implemented")
//    void getCollectionsClientApiTest() throws IOException {
//        // given
//        String uri = UriTemplate.of("/{apiRoot}/collections").expand(new HashMap<String, Object>(){{
//            // Fill in the path variables
//            put("apiRoot", "example");
//        }});
//        MutableHttpRequest<?> request = HttpRequest.GET(uri)
//            .accept("application/taxii+json;version&#x3D;2.1")
//            .header("Accept", "application/taxii+json;version=2.1");
//
//        // when
//        HttpResponse<?> response = client.toBlocking().exchange(request, Collections.class);
//
//        // then
//        Assertions.assertEquals(HttpStatus.OK, response.status());
//    }
//
//    /**
//     * This test is used to validate the implementation of getStatus() method
//     *
//     * The method should: Get status information for a specific status ID
//     *
//     * This Endpoint provides information about the status of a previous request. In TAXII 2.1, the only request that can be monitored is one to add objects to a Collection. It is typically used by TAXII Clients to monitor a POST request that they made in order to take action when it is complete.
//     *
//     * TODO fill in the parameters and test return value.
//     */
//    @Test
//    @Disabled("Not Implemented")
//    void getStatusMethodTest() {
//        // given
//        String apiRoot = "example";
//        String statusId = "example";
//        String accept = "application/taxii+json;version=2.1";
//
//        // when
//        Status result = controller.getStatus(apiRoot, statusId, accept).block();
//
//        // then
//        Assertions.assertTrue(true);
//    }
//
//    /**
//     * This test is used to check that the api available to client through
//     * '/{apiRoot}/status/{statusId}' to the features of getStatus() works as desired.
//     *
//     * TODO fill in the request parameters and test response.
//     */
//    @Test
//    @Disabled("Not Implemented")
//    void getStatusClientApiTest() throws IOException {
//        // given
//        String uri = UriTemplate.of("/{apiRoot}/status/{statusId}").expand(new HashMap<String, Object>(){{
//            // Fill in the path variables
//            put("apiRoot", "example");
//            put("statusId", "example");
//        }});
//        MutableHttpRequest<?> request = HttpRequest.GET(uri)
//            .accept("application/taxii+json;version&#x3D;2.1")
//            .header("Accept", "application/taxii+json;version=2.1");
//
//        // when
//        HttpResponse<?> response = client.toBlocking().exchange(request, Status.class);
//
//        // then
//        Assertions.assertEquals(HttpStatus.OK, response.status());
//    }

}
