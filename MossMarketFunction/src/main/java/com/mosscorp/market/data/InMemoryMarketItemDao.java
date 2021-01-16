package com.mosscorp.market.data;

import com.mosscorp.market.model.ImmutableMarketItem;
import com.mosscorp.market.model.MarketItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InMemoryMarketItemDao implements MarketItemDao {
    private final List<MarketItem> data;

    public InMemoryMarketItemDao() {
        this.data = new ArrayList<>();
        data.add(ImmutableMarketItem.builder()
                .name("item1")
                .price(12.4)
                .accountId("abc")
                .itemId("123")
                .build());
    }

    public InMemoryMarketItemDao(final List<MarketItem> data) {
        this.data = data;
    }

    @Override
    public void putItem(MarketItem item) {
        data.add(item);
    }

    @Override
    public List<MarketItem> listItems(String accountId) {
        return data;
    }

    @Override
    public Optional<MarketItem> findItemById(String itemId, String accountId) {
        return data.stream()
                .filter(item -> item.itemId().equals(itemId) && item.accountId().equals(accountId))
                .findFirst();
    }
}
