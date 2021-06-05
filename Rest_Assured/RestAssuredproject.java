package project;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class RestAssuredproject {
	RequestSpecification requestSpec;

	int id;
	String ssh="ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQCbX6mIYPbfcp8WYBM/RDq39iQu+42pLxBj7qSO105GAajO1IHU5uztoaHTQDeQZPCODo2cZikasX3lN5QzmIiJ6TQv4Ip7SGBceTGl0Dv5idXwKlRJHKAWvEm4Jc3YDaVUpSvN97khskMwqBvyTCt9P6SECB31CLb1BIudYxJWZBdYm2M6/fnLi4E6xU1nlCAersTNGcBcZKR9zk11YnhZfnGytO0J+rytE6drxwkha+9mnJsX+6NuY1Z6W2qa/V123dtzzRi5RKvcJaHBgWNmFPFtvuNX0KFTJWYh8iz7edNL3FLM1hJJxX1oUvztcOrIl/8ubnHFlv73HXp/vozZ";

	@BeforeClass
	public void setUp() {
		String token ="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";
		// Create request specification
		requestSpec = new RequestSpecBuilder()
				// Set content type
				.setContentType(ContentType.JSON)
				//set Token
				.addHeader("Authorization", "Bearer "+token)
				// Set base URL
				.setBaseUri("https://api.github.com")
				// Build request specification
				.build();
	}
	@Test(priority=1)

	public void addKeys() {
		String reqBody = "{"
				+ "\"title\": \"TestAPIKey\","
				+ "\"key\":\""+ssh+"\""
				+ "}";
		Response response = given().spec(requestSpec) // Use requestSpec
				.body(reqBody) // Send request body
				.when().post("/user/keys"); // Send POST request

		id = response.then().extract().path("id");
		System.out.println(id);
		response.then()
		.statusCode(201);
	}
	@Test(priority=2)
	public void getkeys() {
		Response response = given().spec(requestSpec) // Use requestSpec
				.when().get("/user/keys"); // Send GET request

		// Print response
		System.out.println( response.then().log().all());
		// Assertions
		response.then()
		.statusCode(200);
	}



	@Test(priority=3)
	public void deletekeys(int id) { 
		Response response =
				given().spec(requestSpec) 
				 .pathParam("keyId", id)
				.when().delete("/user/keys/{keyId}"); 
		System.out.println( response.then().log().all()); 
		response.then()
		.statusCode(204);
		}

}