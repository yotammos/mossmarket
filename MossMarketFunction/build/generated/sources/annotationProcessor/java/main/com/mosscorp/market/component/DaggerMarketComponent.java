package com.mosscorp.market.component;

import com.mosscorp.market.data.MarketItemDao;
import com.mosscorp.market.module.MarketModule;
import com.mosscorp.market.module.MarketModule_GetMarketItemDaoFactory;
import com.mosscorp.market.module.MarketModule_GetMarketServiceFactory;
import com.mosscorp.market.service.MarketService;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerMarketComponent implements MarketComponent {
  private Provider<MarketItemDao> getMarketItemDaoProvider;

  private Provider<MarketService> getMarketServiceProvider;

  private DaggerMarketComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static MarketComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.getMarketItemDaoProvider =
        DoubleCheck.provider(MarketModule_GetMarketItemDaoFactory.create(builder.marketModule));
    this.getMarketServiceProvider =
        DoubleCheck.provider(
            MarketModule_GetMarketServiceFactory.create(
                builder.marketModule, getMarketItemDaoProvider));
  }

  @Override
  public MarketItemDao buildMarketItemDao() {
    return getMarketItemDaoProvider.get();
  }

  @Override
  public MarketService buildMarketService() {
    return getMarketServiceProvider.get();
  }

  public static final class Builder {
    private MarketModule marketModule;

    private Builder() {}

    public MarketComponent build() {
      if (marketModule == null) {
        this.marketModule = new MarketModule();
      }
      return new DaggerMarketComponent(this);
    }

    public Builder marketModule(MarketModule marketModule) {
      this.marketModule = Preconditions.checkNotNull(marketModule);
      return this;
    }
  }
}
