package com.mosscorp.market.handler;

import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import static org.junit.Assert.assertEquals;

import com.mosscorp.market.TestContext;
import org.junit.Test;

public class PingTest {
  @Test
  public void successfulResponse() {
    Ping ping = new Ping();
    APIGatewayProxyResponseEvent result = ping.handleRequest(null, new TestContext());
    assertEquals(result.getStatusCode().intValue(), 204);
  }
}
