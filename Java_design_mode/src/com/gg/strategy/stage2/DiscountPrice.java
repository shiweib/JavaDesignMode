package com.gg.strategy.stage2;

/**
 * 
 * @author shiweibo
 *
 * 2018年6月13日
 */
public class DiscountPrice implements Price{

	private double price;
	private int num;
	private double discount;
	
	public DiscountPrice(double price, int num,double discount) {
		super();
		this.price = price;
		this.num = num;
		this.discount = discount;
	}

	@Override
	public double getPrice() {
		return num * price * discount;
	}
}
