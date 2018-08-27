package com.gg.strategy.stage2;

import com.gg.strategy.stage1.DiscountPrice;
import com.gg.strategy.stage1.NumberPrice;
import com.gg.strategy.stage1.Price;
import com.gg.strategy.stage1.ReturnPrice;

public class PriceContext {

	private Price priceObject;
	
	public PriceContext(double price,int num,int type){
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
	}
	
	public double getPrice(){
		return priceObject.getPrice();
	}
}
