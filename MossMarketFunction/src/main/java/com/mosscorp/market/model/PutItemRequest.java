package com.mosscorp.market.model;

import org.immutables.value.Value;

@Value.Immutable
public abstract class PutItemRequest {
    public abstract String accountId();
    public abstract String name();
    public abstract double price();
}
