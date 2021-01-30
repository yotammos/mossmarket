package com.mosscorp.market.data;

import com.mosscorp.market.model.MarketItem;
import com.mosscorp.market.util.Constants;
import software.amazon.awssdk.http.HttpStatusCode;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;
import software.amazon.awssdk.services.dynamodb.model.GetItemRequest;
import software.amazon.awssdk.services.dynamodb.model.GetItemResponse;
import software.amazon.awssdk.services.dynamodb.model.PutItemRequest;
import software.amazon.awssdk.services.dynamodb.model.PutItemResponse;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class DynamoDBMarketItemDao implements MarketItemDao {

    private final DynamoDbClient ddbClient;
    private final String tableName;

    @Inject
    public DynamoDBMarketItemDao(final DynamoDbClient ddbClient, @Named("tableName") String tableName) {
        this.ddbClient = ddbClient;
        this.tableName = tableName;
    }

    @Override
    public void putItem(final MarketItem marketItem) throws Exception {
        PutItemRequest putItemRequest = PutItemRequest.builder()
                .item(MarketItemDynamoDBMapper.fromDomain(marketItem))
                .build();

        PutItemResponse result = ddbClient.putItem(putItemRequest);
        int statusCode = result.sdkHttpResponse().statusCode();
        if (statusCode != HttpStatusCode.OK) {
            throw new Exception("failed putting item in DB, status code = " + statusCode);
        }
    }

    @Override
    public List<MarketItem> listItems(final String accountId) {
        GetItemRequest getItemRequest = GetItemRequest.builder()
                .key(Map.of(Constants.ACCOUNT_ID, AttributeValue.builder().s(accountId).build()))
                .tableName(tableName)
                .build();

        GetItemResponse result = ddbClient.getItem(getItemRequest);

        return List.of(MarketItemDynamoDBMapper.toDomain(result.item()));
    }

    @Override
    public Optional<MarketItem> findItemById(final String itemId, final String accountId) {
        return Optional.empty();
    }
}
