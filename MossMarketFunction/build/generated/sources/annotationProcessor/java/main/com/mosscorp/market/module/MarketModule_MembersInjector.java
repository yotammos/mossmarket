package com.mosscorp.market.module;

import com.mosscorp.market.data.MarketItemDao;
import com.mosscorp.market.service.MarketService;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MarketModule_MembersInjector implements MembersInjector<MarketModule> {
  private final Provider<MarketItemDao> daoProvider;

  public MarketModule_MembersInjector(Provider<MarketItemDao> daoProvider) {
    this.daoProvider = daoProvider;
  }

  public static MembersInjector<MarketModule> create(Provider<MarketItemDao> daoProvider) {
    return new MarketModule_MembersInjector(daoProvider);
  }

  @Override
  public void injectMembers(MarketModule instance) {
    injectGetMarketService(instance, daoProvider.get());
  }

  public static MarketService injectGetMarketService(MarketModule instance, MarketItemDao dao) {
    return instance.getMarketService(dao);
  }
}
