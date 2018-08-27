package com.gg.strategy.stage1;

public class PriceFactory {

	public static Price createPrice(double price,int num,int type){
		Price priceObject = null;
		switch (type) {
		case 1:
			priceObject = new NumberPrice(price, num);
			break;
		case 2:
			priceObject = new DiscountPrice(price, num, 0.8);
			break;
		case 3:
			priceObject = new ReturnPrice(price, num, 300, 100);
			break;
		default:
			break;
		}
		return priceObject;
	}
}
