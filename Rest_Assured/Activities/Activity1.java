import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
//import static org.hamcrest.CoreMatchers.equalTo;

//import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Activity1 {
    // Set base URL
    final static String ROOT_URI = "https://petstore.swagger.io/v2/pet";

    @Test
    @Order(1)
    public void addNewPet() {
        // Create JSON request
        String reqBody = "{"
                + "\"id\": 98689,"
                + "\"name\": \"Jack\","
                + " \"status\": \"dead\""
                + "}";

        Response response =
                given().contentType(ContentType.JSON) // Set headers
                        .body(reqBody) // Add request body
                        .when().post(ROOT_URI); // Send POST request

        // Assertion
        response.then().body("id", equalTo(98689));
        response.then().body("name", equalTo("Jack"));
        response.then().body("status", equalTo("dead"));
    }

    @Test
    @Order(2)
    public void getPetInfo() {
        Response response =
                given().contentType(ContentType.JSON) // Set headers
                        .when().pathParam("petId", "98689") // Set path parameter
                        .get(ROOT_URI + "/{petId}"); // Send GET request

        // Assertion
        response.then().body("id", equalTo(98689));
        response.then().body("name", equalTo("Jack"));
        response.then().body("status", equalTo("dead"));
    }

    @Test
    @Order(3)
    public void deletePet() {
        Response response =
                given().contentType(ContentType.JSON) // Set headers
                        .when().pathParam("petId", "98689") // Set path parameter
                        .delete(ROOT_URI + "/{petId}"); // Send DELETE request

        // Assertion
        response.then().body("code", equalTo(200));
        response.then().body("message", equalTo("98689"));
    }
}
