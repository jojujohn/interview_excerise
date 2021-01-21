package com.acme.mytrader.strategy;

import com.acme.mytrader.price.PriceListener;

/**
 * <pre>
 * User Story: As a trader I want to be able to monitor stock prices such
 * that when they breach a trigger level orders can be executed automatically
 * </pre>
 */
public class TradingStrategy {
	private PriceSourceAdapter ps ;
	
	public TradingStrategy(PriceSourceAdapter ps){
		this.ps=ps;
		/** Creates an instance of the PriceListener
		* Ideally this should be a factory as we might have different 
		* price listeners for different stocks and factory will return a list of price listeners
		*  Short circuiting this and Using a lambda to implement the priceUpdate method
		*/
		TradingStrategyHelper tsh=new TradingStrategyHelper();
		PriceListener pt=tsh::executeOrders;
		// Register the price Listener with the Price Source which is external
		addPriceListener(pt);
	}
	
	public void monitorStocks(String security,double price) {
		
		ps.onChange(security,price);
			
		
	}
	/**
	 * Registers the price listener
	 * @param pt
	 */
	private void addPriceListener(PriceListener pt) {
		// Go to have null check
		// I would create an adaptor here and call the third party Price source in the adaptee method
		if(pt!=null) {
			
			ps.addPriceListener(pt);
		}
		
	}
	
	
	
	
}
