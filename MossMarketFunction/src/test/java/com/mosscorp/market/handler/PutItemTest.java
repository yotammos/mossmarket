package com.mosscorp.market.handler;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.mosscorp.market.TestContext;
import com.mosscorp.market.handler.PutItem;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PutItemTest {

    private PutItem putItem;

    @Before
    public void setup() {
        putItem = new PutItem();
    }

    @Test
    public void nullRequestTest() {
        APIGatewayProxyResponseEvent responseEvent = putItem.handleRequest(null, new TestContext());
        Assert.assertEquals(responseEvent.getStatusCode(), Integer.valueOf(400));
        Assert.assertEquals(responseEvent.getBody(), "null argument found");
    }
}
