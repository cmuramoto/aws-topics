package com.nc.aws;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class RoundTripTest {

	ObjectMapper om = new ObjectMapper();

	@Test
	public void roundTrip() throws Exception {
		var in = Map.of("foo", "bar");

		var req = new APIGatewayProxyRequestEvent().withBody(om.writeValueAsString(in));

		var res = given().contentType("application/json").accept("application/json").body(req).when().post().then().statusCode(200).extract().as(HashMap.class).get("body");

                var map = om.readValue((String)res, HashMap.class);
 
		assertEquals(in, map);
	}
}


