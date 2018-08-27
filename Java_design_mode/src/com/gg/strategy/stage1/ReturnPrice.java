package com.gg.strategy.stage1;

/**
 * 返利
 * @author shiweibo
 *
 * 2018年6月13日
 */
public class ReturnPrice  implements Price{

	private double price;
	private int num;
	private double moneyCodition;
	private double moneyReturn;
	
	public ReturnPrice(double price, int num,double moneyCodition,double moneyReturn) {
		super();
		this.price = price;
		this.num = num;
		this.moneyCodition = moneyCodition;
		this.moneyReturn = moneyReturn;
	}

	@Override
	public double getPrice() {
		double money = num * price;
		money -= (int)(money / moneyCodition) * moneyReturn;
		return money;
	}
}
