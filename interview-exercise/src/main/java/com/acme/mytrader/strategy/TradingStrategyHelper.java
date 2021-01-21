package com.acme.mytrader.strategy;

import java.util.HashMap;

import com.acme.mytrader.execution.ExecutionService;

public class TradingStrategyHelper {
	public static final String BUY="BUY";
	public static final String SELL="SELL";
	private HashMap<String, Boolean> buyCache=new HashMap <String, Boolean>(); 
	private static final ExecutionService es =getInstance();
	
	
	/** scaffholder 
	 *  return the actual Execution Service class
	 * 
	 * @return
	 */
	private static ExecutionService getInstance() {
		return 
				new ExecutionService() {

			@Override
			public void buy(String security, double price, int volume) {
				// TODO Auto-generated method stub
				System.out.println("buy is"+price+volume);
				
			}

			@Override
			public void sell(String security, double price, int volume) {
				// TODO Auto-generated method stub
				System.out.println("sell is");
			}
			
		};
	}
	
	/**
	 * This method will have the logic to execute the orders 
	 *  buy or sell based 
	 * @param security
	 * @param proce
	 */
	public void  executeOrders(String security,Double price) {
		
		// get the thresholds for buying and selling for a given stock
		Stock s=StockMDM.getVolumeLimit(security);
		
		boolean isBuyExecutionRequired=s!=null?(s.getBuyingPrice()>price?true:false):false;
		if(isBuyExecutionRequired && !this.buyCache.containsKey(security)) {
			es.buy(security, price, s.getBuyingVolume());
			buyCache.put(security,Boolean.TRUE);
		}
		
		
		
	}
	
	
	
	

}
;