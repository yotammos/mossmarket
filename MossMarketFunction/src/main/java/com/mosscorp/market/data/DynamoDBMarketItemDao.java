package com.mosscorp.market.data;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.model.*;
import com.mosscorp.market.model.MarketItem;
import com.mosscorp.market.util.Constants;
import org.apache.http.HttpStatus;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class DynamoDBMarketItemDao implements MarketItemDao {

    private final AmazonDynamoDB dynamoDB;
    private final String tableName;

    @Inject
    public DynamoDBMarketItemDao(final AmazonDynamoDB dynamoDB, @Named("tableName") String tableName) {
        this.dynamoDB = dynamoDB;
        this.tableName = tableName;
    }

    @Override
    public void putItem(final MarketItem marketItem) throws Exception {
        PutItemRequest putItemRequest = new PutItemRequest()
                .withItem(MarketItemDynamoDBMapper.fromDomain(marketItem));

        PutItemResult result = dynamoDB.putItem(putItemRequest);
        int statusCode = result.getSdkHttpMetadata().getHttpStatusCode();
        if (statusCode != HttpStatus.SC_OK) {
            throw new Exception("failed putting item in DB, status code = " + statusCode);
        }
    }

    @Override
    public List<MarketItem> listItems(final String accountId) {
        GetItemRequest getItemRequest = new GetItemRequest()
                .withKey(Map.of(Constants.ACCOUNT_ID, new AttributeValue(accountId)))
                .withTableName(tableName);

        GetItemResult result = dynamoDB.getItem(getItemRequest);

        return List.of(MarketItemDynamoDBMapper.toDomain(result.getItem()));
    }

    @Override
    public Optional<MarketItem> findItemById(final String itemId, final String accountId) {
        return Optional.empty();
    }
}
