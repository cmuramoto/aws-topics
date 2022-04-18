package com.nc.aws;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import javax.inject.Named;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

/**
 * Handler for requests to Lambda function.
 */
@Named("gatewayhandler")
public class App implements RequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {

	static final Map<String, String> HEADERS = Map.of( //
			"Content-Type", "application/json", //
			"X-Custom-Header", "application/json" //
	);

	@Override
	public APIGatewayProxyResponseEvent handleRequest(APIGatewayProxyRequestEvent input, Context context) {
		var response = new APIGatewayProxyResponseEvent() //
				.withHeaders(HEADERS) //
				.withBody(input.getBody()) //
				.withStatusCode(200);

		return response;
	}
}
