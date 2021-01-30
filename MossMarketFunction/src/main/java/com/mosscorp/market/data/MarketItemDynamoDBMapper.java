package com.mosscorp.market.data;

import com.mosscorp.market.model.ImmutableMarketItem;
import com.mosscorp.market.model.MarketItem;
import com.mosscorp.market.util.Constants;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;

import java.util.Map;

public class MarketItemDynamoDBMapper {

    private MarketItemDynamoDBMapper() {};

    public static MarketItem toDomain(final Map<String, AttributeValue> attributeMap) {
        return ImmutableMarketItem.builder()
                .itemId(attributeMap.get(Constants.ITEM_ID).s())
                .accountId(attributeMap.get(Constants.ACCOUNT_ID).s())
                .name(attributeMap.get(Constants.NAME).s())
                .price(Double.parseDouble(attributeMap.get(Constants.PRICE).s()))
                .build();
    }

    public static Map<String, AttributeValue> fromDomain(final MarketItem marketItem) {
        return Map.of(
                Constants.ITEM_ID, AttributeValue.builder().s(marketItem.itemId()).build(),
                Constants.ACCOUNT_ID, AttributeValue.builder().s(marketItem.accountId()).build(),
                Constants.NAME, AttributeValue.builder().s(marketItem.name()).build(),
                Constants.PRICE, AttributeValue.builder().n(String.valueOf(marketItem.price())).build()
        );
    }

}
