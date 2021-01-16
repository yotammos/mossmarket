package com.mosscorp.market.service;

import com.mosscorp.market.data.MarketItemDao;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MarketServiceImpl_Factory implements Factory<MarketServiceImpl> {
  private final Provider<MarketItemDao> daoProvider;

  public MarketServiceImpl_Factory(Provider<MarketItemDao> daoProvider) {
    this.daoProvider = daoProvider;
  }

  @Override
  public MarketServiceImpl get() {
    return provideInstance(daoProvider);
  }

  public static MarketServiceImpl provideInstance(Provider<MarketItemDao> daoProvider) {
    return new MarketServiceImpl(daoProvider.get());
  }

  public static MarketServiceImpl_Factory create(Provider<MarketItemDao> daoProvider) {
    return new MarketServiceImpl_Factory(daoProvider);
  }

  public static MarketServiceImpl newMarketServiceImpl(MarketItemDao dao) {
    return new MarketServiceImpl(dao);
  }
}
