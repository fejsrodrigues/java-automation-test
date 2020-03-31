package com.automation.test.util.request;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ResquestPost extends Spec {


    private final String BASEURL = "https://jsonplaceholder.typicode.com";
    private Response response;

    public Response postWitoutHeader(Object body) {
        String url = BASEURL + "/posts";
        RequestSpecification http = spec();
        http.baseUri(url);
        http.body(body);
        http.contentType(ContentType.JSON);

        return http.post();

    }


}
