package ru.netology.rest;

import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class postmanEchoTest {
    @Test
    void ShouldReturnSendData() {
        String text = "Hi";
        given()
                .baseUri("https://postman-echo.com")
                .body("Hi")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", (Matcher<?>) equalTo("Hi"));


    }
}

