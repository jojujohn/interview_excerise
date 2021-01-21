package com.acme.mytrader.strategy;

public class Stock {
	
	private double buyingPrice;
	private double sellingPrice;
	
	public double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public int getSellingVolume() {
		return sellingVolume;
	}

	public void setSellingVolume(int sellingVolume) {
		this.sellingVolume = sellingVolume;
	}

	public int getBuyingVolume() {
		return buyingVolume;
	}

	public void setBuyingVolume(int buyingVolume) {
		this.buyingVolume = buyingVolume;
	}

	public double getBuyingPrice() {
		return buyingPrice;
	}

	@Override
	public String toString() {
		return "Stock [buyingPrice=" + buyingPrice + ", sellingPrice=" + sellingPrice + ", sellingVolume="
				+ sellingVolume + ", buyingVolume=" + buyingVolume + "]";
	}

	public void setBuyingPrice(double buyingPrice) {
		this.buyingPrice = buyingPrice;
	}

	private int sellingVolume;
	
	private int buyingVolume;

	

}
