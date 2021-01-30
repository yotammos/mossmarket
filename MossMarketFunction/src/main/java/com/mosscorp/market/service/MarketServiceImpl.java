package com.mosscorp.market.service;

import com.mosscorp.market.data.MarketItemDao;
import com.mosscorp.market.model.ImmutableMarketItem;
import com.mosscorp.market.model.MarketItem;

import javax.inject.Inject;
import java.util.List;
import java.util.UUID;

public class MarketServiceImpl implements MarketService {
    private final MarketItemDao dao;

    @Inject
    public MarketServiceImpl(MarketItemDao dao) {
        this.dao = dao;
    }

    @Override
    public List<MarketItem> listItems(String accountId) {
        return dao.listItems(accountId);
    }

    @Override
    public String putItem(String accountId, String name, double price) throws Exception {
        String itemId = UUID.randomUUID().toString();
        MarketItem item = ImmutableMarketItem.builder()
                .accountId(accountId)
                .itemId(itemId)
                .name(name)
                .price(price)
                .build();
        dao.putItem(item);
        return itemId;
    }
}
