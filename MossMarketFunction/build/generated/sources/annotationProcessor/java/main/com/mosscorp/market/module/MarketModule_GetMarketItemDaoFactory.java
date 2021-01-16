package com.mosscorp.market.module;

import com.mosscorp.market.data.MarketItemDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MarketModule_GetMarketItemDaoFactory implements Factory<MarketItemDao> {
  private final MarketModule module;

  public MarketModule_GetMarketItemDaoFactory(MarketModule module) {
    this.module = module;
  }

  @Override
  public MarketItemDao get() {
    return provideInstance(module);
  }

  public static MarketItemDao provideInstance(MarketModule module) {
    return proxyGetMarketItemDao(module);
  }

  public static MarketModule_GetMarketItemDaoFactory create(MarketModule module) {
    return new MarketModule_GetMarketItemDaoFactory(module);
  }

  public static MarketItemDao proxyGetMarketItemDao(MarketModule instance) {
    return Preconditions.checkNotNull(
        instance.getMarketItemDao(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
