package com.mosscorp.market.service;

import com.mosscorp.market.data.InMemoryMarketItemDao;
import com.mosscorp.market.data.MarketItemDao;
import com.mosscorp.market.model.ImmutablePutItemRequest;
import com.mosscorp.market.model.MarketItem;
import com.mosscorp.market.model.PutItemRequest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class MarketServiceTest {

    private MarketItemDao dao;
    private MarketService marketService;

    @Before
    public void setup() {
        this.dao = new InMemoryMarketItemDao();
        this.marketService = new MarketServiceImpl(dao);
    }

    @Test
    public void putItemTest() {
        PutItemRequest request1 = ImmutablePutItemRequest.builder().accountId("1").name("item1").price(55).build();
        PutItemRequest request2 = ImmutablePutItemRequest.builder().accountId("1").name("item2").price(27.5).build();

        Assert.assertNotNull(marketService.putItem(request1.accountId(), request1.name(), request1.price()));
        Assert.assertNotNull(marketService.putItem(request2.accountId(), request2.name(), request2.price()));

        List<MarketItem> items = dao.listItems("1");
        Assert.assertNotNull(items);
        Assert.assertEquals(items.size(), 3);
        Assert.assertEquals(items.get(1).name(), "item1");
    }

    @Test
    public void listItemsTest() {
        List<MarketItem> items = dao.listItems("abc");
        Assert.assertNotNull(items);
        Assert.assertEquals(items.size(), 1);
        Assert.assertEquals(items.get(0).name(), "item1");
    }
}
