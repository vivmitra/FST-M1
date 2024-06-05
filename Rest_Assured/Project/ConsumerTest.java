package pactproject;


import au.com.dius.pact.consumer.dsl.DslPart;
import au.com.dius.pact.consumer.dsl.PactDslJsonBody;
import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.consumer.junit5.PactConsumerTestExt;
import au.com.dius.pact.consumer.junit5.PactTestFor;
import au.com.dius.pact.core.model.RequestResponsePact;
import au.com.dius.pact.core.model.annotations.Pact;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@ExtendWith(PactConsumerTestExt.class)
public class ConsumerTest {
    //Create the header map
   Map<String, String> headers = new HashMap<>();

   //Create Contract
    @Pact(consumer = "UserConsumer" , provider = "UserProvider")
    public RequestResponsePact createPact(PactDslWithProvider builder){

        //Set our headers to JSON
        headers.put("Content-Type", "application/json");

        //Set the req/res body
        DslPart requestResponseBody = new PactDslJsonBody()
                .numberType("id", 299)
                .stringType("firstName", "Vivek")
                .stringType("lastName", "Mitra")
                .stringType("email", "vmitra@gmail.com");

        //Create the contract
        return builder.given("POST Request")
                .uponReceiving("Request to create a user")
                    .method("POST")
                    .path("/api/users")
                    .headers(headers)
                    .body(requestResponseBody)
                .willRespondWith()
                    .status(201)
                    .body(requestResponseBody)
                .toPact();
    }

    //Test
    @Test
    @PactTestFor(providerName = "UserProvider", port = "8282")
    public void consumerTest() {
        //Req body
        Map<String, Object> reqBody = new HashMap<>();
        reqBody.put("id", 299);
        reqBody.put("firstName", "Vivek");
        reqBody.put("lastName", "Mitra");
        reqBody.put("email", "vmitra@gmail.com");

        //Send POST Request
        given().baseUri("http://localhost:8282/api/users")
                .headers(headers)
                .body(reqBody)
                .log().all()
                .when().post()
                .then().statusCode(201)
                .body("email",equalTo("vmitra@gmail.com")).log().all();

    }

}
