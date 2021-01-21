package com.acme.mytrader.strategy;

import java.util.LinkedHashMap;

public class StockMDM {
	private static LinkedHashMap<String, Stock > hmCache=new LinkedHashMap <String, Stock >();
	static {
		intializeCache();
	}
	
	
	/**
	 * Stock Meta data manager will decide whether to buy, sell or both based on 
	 *  the stock and the current price
	 *  Will have the set of stocks which we are interested and rules for each stock 
	 *  This will contain the actual business rules whether to buy or sell
	 *  based on rules 
	 *  Will return stock model object 
	 *  I guess this has to be cached and not to be recalculated for every call
	 *  Caching mechanism  yet to be implemented
	 * @param security
	 * @param price
	 * @return
	 */
	public static Stock getVolumeLimit(String security) {
		
		Stock stk=hmCache.get(security);

		
		return stk;
		
		
	}

	/**
	 * load data from configs
	 */
	private static void intializeCache() {
		// TODO Auto-generated method stub
		Stock s=new Stock();
		s.setSellingPrice(200);
		s.setSellingVolume(50);
		s.setBuyingPrice(100);
		s.setBuyingVolume(70);
		hmCache.put("IBM", s);
		
		
		
	}

}
