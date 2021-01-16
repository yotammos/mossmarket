package com.mosscorp.market.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

import java.net.HttpURLConnection;

/**
 * Handler for requests to Lambda function.
 */
public class Ping implements RequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {

    public APIGatewayProxyResponseEvent handleRequest(final APIGatewayProxyRequestEvent input, final Context context) {
        return new APIGatewayProxyResponseEvent().withStatusCode(HttpURLConnection.HTTP_NO_CONTENT);
    }
}
