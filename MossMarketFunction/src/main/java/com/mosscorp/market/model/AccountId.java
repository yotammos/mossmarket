package com.mosscorp.market.model;

import org.immutables.value.Value;

@Value.Immutable
public abstract class AccountId {
    public abstract String accountId();
}
