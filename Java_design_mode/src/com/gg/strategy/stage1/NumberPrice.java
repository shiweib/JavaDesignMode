package com.gg.strategy.stage1;

public class NumberPrice implements Price{

	private double price;
	private int num;
	
	public NumberPrice(double price, int num) {
		super();
		this.price = price;
		this.num = num;
	}

	@Override
	public double getPrice() {
		return num * price;
	}

}
