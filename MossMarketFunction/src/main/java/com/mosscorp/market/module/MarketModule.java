package com.mosscorp.market.module;

import com.mosscorp.market.service.MarketService;
import com.mosscorp.market.service.MarketServiceImpl;
import dagger.Module;
import com.mosscorp.market.data.InMemoryMarketItemDao;
import com.mosscorp.market.data.MarketItemDao;
import dagger.Provides;

import javax.inject.Inject;
import javax.inject.Singleton;

@Module
public class MarketModule {

    @Provides
    @Singleton
    public MarketItemDao getMarketItemDao() {
        return new InMemoryMarketItemDao();
    }

    @Provides
    @Singleton
    @Inject
    public MarketService getMarketService(MarketItemDao dao) {
        return new MarketServiceImpl(dao);
    }
}
