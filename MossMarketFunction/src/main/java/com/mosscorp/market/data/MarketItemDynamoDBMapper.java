package com.mosscorp.market.data;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.mosscorp.market.model.ImmutableMarketItem;
import com.mosscorp.market.model.MarketItem;
import com.mosscorp.market.util.Constants;

import java.util.Map;

public class MarketItemDynamoDBMapper {

    private MarketItemDynamoDBMapper() {};

    public static MarketItem toDomain(final Map<String, AttributeValue> attributeMap) {
        return ImmutableMarketItem.builder()
                .itemId(attributeMap.get(Constants.ITEM_ID).getS())
                .accountId(attributeMap.get(Constants.ACCOUNT_ID).getS())
                .name(attributeMap.get(Constants.NAME).getS())
                .price(Double.parseDouble(attributeMap.get(Constants.PRICE).getN()))
                .build();
    }

    public static Map<String, AttributeValue> fromDomain(final MarketItem marketItem) {
        return Map.of(
                Constants.ITEM_ID, new AttributeValue(marketItem.itemId()),
                Constants.ACCOUNT_ID, new AttributeValue(marketItem.accountId()),
                Constants.NAME, new AttributeValue(marketItem.name()),
                Constants.PRICE, new AttributeValue(String.valueOf(marketItem.price()))
        );
    }

}
