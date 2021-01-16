package com.mosscorp.market.service;

import com.mosscorp.market.model.MarketItem;

import java.util.List;

public interface MarketService {
    List<MarketItem> listItems(final String accountId);
    String putItem(final String accountId, final String name, final double price);
}
