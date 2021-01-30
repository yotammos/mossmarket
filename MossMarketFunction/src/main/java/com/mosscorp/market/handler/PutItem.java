package com.mosscorp.market.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

import com.mosscorp.market.component.DaggerMarketComponent;
import com.mosscorp.market.component.MarketComponent;
import com.mosscorp.market.model.PutItemRequest;
import com.mosscorp.market.service.MarketService;
import com.mosscorp.market.util.LambdaUtils;

import software.amazon.awssdk.http.HttpStatusCode;

public class PutItem implements RequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {

    private final Gson gson;
    private final MarketService marketService;

    public PutItem() {
        this.gson = new GsonBuilder().setPrettyPrinting().create();
        final MarketComponent component = DaggerMarketComponent.create();
        marketService = component.buildMarketService();
    }

    @Override
    public APIGatewayProxyResponseEvent handleRequest(final APIGatewayProxyRequestEvent requestEvent,
                                                      final Context context) {
        final APIGatewayProxyResponseEvent responseEvent = LambdaUtils.jsonResponse();
        if (requestEvent == null || context == null) {
            return responseEvent.withBody("null argument found").withStatusCode(HttpStatusCode.BAD_REQUEST);
        }

        try {
            final PutItemRequest request = gson.fromJson(requestEvent.getBody(), PutItemRequest.class);
            final String itemId = marketService.putItem(request.accountId(), request.name(), request.price());
            return responseEvent.withBody(itemId).withStatusCode(HttpStatusCode.OK);
        } catch (final JsonSyntaxException ignored) {
            return responseEvent.withBody("invalid request format").withStatusCode(HttpStatusCode.BAD_REQUEST);
        } catch (final Exception e) {
            return responseEvent.withBody(e.getMessage()).withStatusCode(HttpStatusCode.INTERNAL_SERVER_ERROR);
        }
    }
}
