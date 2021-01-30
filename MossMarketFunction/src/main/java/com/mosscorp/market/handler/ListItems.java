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
import com.mosscorp.market.model.AccountId;
import com.mosscorp.market.model.MarketItem;
import com.mosscorp.market.service.MarketService;
import com.mosscorp.market.util.LambdaUtils;

import software.amazon.awssdk.http.HttpStatusCode;

import java.util.List;


public class ListItems implements RequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {

    private final Gson gson;
    private final MarketService marketService;

    public ListItems() {
        this.gson = new GsonBuilder().setPrettyPrinting().create();
        final MarketComponent component = DaggerMarketComponent.create();
        marketService = component.buildMarketService();
    }

    public APIGatewayProxyResponseEvent handleRequest(final APIGatewayProxyRequestEvent requestEvent,
                                                      final Context context) {
        final APIGatewayProxyResponseEvent responseEvent = LambdaUtils.jsonResponse();
        if (requestEvent == null || context == null) {
            return responseEvent.withBody("null argument found").withStatusCode(HttpStatusCode.BAD_REQUEST);
        }

        try {
            final AccountId accountIdResult = gson.fromJson(requestEvent.getBody(), AccountId.class);
            final List<MarketItem> items = marketService.listItems(accountIdResult.accountId());
            return responseEvent.withBody(gson.toJson(items)).withStatusCode(HttpStatusCode.OK);
        } catch (final JsonSyntaxException ignored) {
            return responseEvent.withBody("invalid request format").withStatusCode(HttpStatusCode.BAD_REQUEST);
        } catch (final Exception e) {
            return responseEvent.withBody(e.getMessage()).withStatusCode(HttpStatusCode.INTERNAL_SERVER_ERROR);
        }
    }
}
