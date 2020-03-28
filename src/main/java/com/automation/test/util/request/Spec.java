package com.automation.test.util.request;

import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class Spec {


    public RequestSpecification spec() {

        return given().config(RestAssured.config().sslConfig(new SSLConfig().allowAllHostnames()));

    }


}
