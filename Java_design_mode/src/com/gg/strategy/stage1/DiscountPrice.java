package com.gg.strategy.stage1;

public class DiscountPrice implements Price{

	private double price;
	private int num;
	private double 
	
	public DiscountPrice(double price, int num) {
		super();
		this.price = price;
		this.num = num;
	}

	@Override
	public double getPrice() {
		return num * price;
	}
}
