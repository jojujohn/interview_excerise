package com.acme.mytrader.strategy;

import org.junit.Test;

public class TradingStrategyTest {
    @Test
    public void testNothing() {
    	PriceSourceAdapter psA=new PriceSourceAdapter();
    	TradingStrategy ts=new TradingStrategy(psA);
    	for (int i=30;i<200;i=i+20) {
    	ts.monitorStocks("IBM",i);
    	}
    	
    }
}
