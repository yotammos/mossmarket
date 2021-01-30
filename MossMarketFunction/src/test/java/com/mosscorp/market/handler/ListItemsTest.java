package com.mosscorp.market.handler;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mosscorp.market.TestContext;
import com.mosscorp.market.model.ImmutableAccountId;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import software.amazon.awssdk.http.HttpStatusCode;

public class ListItemsTest {

    private Gson gson;
    private ListItems listItems;

    @Before
    public void setup() {
        gson = new GsonBuilder().setPrettyPrinting().create();
        listItems = new ListItems();
    }

    @Test
    public void nullRequestTest() {
        APIGatewayProxyResponseEvent responseEvent = listItems.handleRequest(
                new APIGatewayProxyRequestEvent()
                        .withBody(gson.toJson(
                                ImmutableAccountId.builder().accountId("12").build()
                        )),
                new TestContext()
        );
        Assert.assertEquals(responseEvent.getStatusCode(), Integer.valueOf(HttpStatusCode.INTERNAL_SERVER_ERROR));
        Assert.assertEquals(responseEvent.getBody(), "Failed to invoke public com.mosscorp.market.model.AccountId() with no args");
    }
}
