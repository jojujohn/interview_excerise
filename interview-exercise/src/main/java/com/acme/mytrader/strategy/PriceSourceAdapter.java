package com.acme.mytrader.strategy;

import com.acme.mytrader.price.PriceListener;
import com.acme.mytrader.price.PriceSource;

public class PriceSourceAdapter implements PriceSource {
	
	private PriceListener listener;

	@Override
	/**
	 *  method to register the actual listener or observer
	 */
	public void addPriceListener(PriceListener listener) {
		// TODO Auto-generated method stub
		// will have the actual call to the price listener class here
		this.listener=listener;

	}

	@Override
	public void removePriceListener(PriceListener listener) {
		// TODO Auto-generated method stub
		this.listener=null;

	}
	
	public void onChange (String stock,double price) {
		listener.priceUpdate(stock, price);
		
	}

}
