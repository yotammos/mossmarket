package com.mosscorp.market.component;

import com.mosscorp.market.data.MarketItemDao;
import com.mosscorp.market.module.MarketModule;
import com.mosscorp.market.service.MarketService;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = MarketModule.class)
public interface MarketComponent {
    MarketItemDao buildMarketItemDao();
    MarketService buildMarketService();
}
