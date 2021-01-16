package com.mosscorp.market.module;

import com.mosscorp.market.data.MarketItemDao;
import com.mosscorp.market.service.MarketService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MarketModule_GetMarketServiceFactory implements Factory<MarketService> {
  private final MarketModule module;

  private final Provider<MarketItemDao> daoProvider;

  public MarketModule_GetMarketServiceFactory(
      MarketModule module, Provider<MarketItemDao> daoProvider) {
    this.module = module;
    this.daoProvider = daoProvider;
  }

  @Override
  public MarketService get() {
    return provideInstance(module, daoProvider);
  }

  public static MarketService provideInstance(
      MarketModule module, Provider<MarketItemDao> daoProvider) {
    return proxyGetMarketService(module, daoProvider.get());
  }

  public static MarketModule_GetMarketServiceFactory create(
      MarketModule module, Provider<MarketItemDao> daoProvider) {
    return new MarketModule_GetMarketServiceFactory(module, daoProvider);
  }

  public static MarketService proxyGetMarketService(MarketModule instance, MarketItemDao dao) {
    return Preconditions.checkNotNull(
        instance.getMarketService(dao), "Cannot return null from a non-@Nullable @Provides method");
  }
}
