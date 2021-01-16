package com.mosscorp.market.util;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

import java.util.HashMap;
import java.util.Map;

public class LambdaUtils {
    public static APIGatewayProxyResponseEvent jsonResponse() {
        final Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("X-Custom-Header", "application/json");

        return new APIGatewayProxyResponseEvent().withHeaders(headers);
    }
}
