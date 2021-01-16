package com.mosscorp.market.data;

import com.mosscorp.market.model.MarketItem;

import java.util.List;
import java.util.Optional;

public interface MarketItemDao {
    void putItem(final MarketItem item);

    List<MarketItem> listItems(final String accountId);

    Optional<MarketItem> findItemById(final String itemId, final String accountId);
}
