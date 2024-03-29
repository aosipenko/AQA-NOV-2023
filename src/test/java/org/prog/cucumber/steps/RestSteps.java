package org.prog.cucumber.steps;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.prog.util.DataHolder;
import org.prog.web.dto.SearchResultsDto;
import org.springframework.beans.factory.annotation.Autowired;

public class RestSteps {

    @Autowired
    private DataHolder dataHolder;

    @Given("I request {int} users from random user service as {string}")
    public void requestUsersFromService(int amount, String alias) {
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.queryParam("inc", "gender,name,nat");
        requestSpecification.queryParam("noinfo");
        requestSpecification.queryParam("results", amount);
        requestSpecification.basePath("/api/");
        requestSpecification.baseUri("https://randomuser.me/");

        Response response = requestSpecification.get();
        response.then().statusCode(200);

        SearchResultsDto dto = response.as(SearchResultsDto.class);
        dataHolder.put(alias, dto.getResults());
    }
}
