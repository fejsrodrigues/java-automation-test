package com.automation.test.services;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "title",
        "body",
        "userId"
})
public class PostRequest {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("body")
    private String body;
    @JsonProperty("userId")
    private Integer userId;

    public Integer getId() {
        return id;
    }

    public PostRequest setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public PostRequest setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getBody() {
        return body;
    }

    public PostRequest setBody(String body) {
        this.body = body;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public PostRequest setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }
}
