package com.gg.strategy.stage1;

import java.util.Scanner;

public class TestView {

	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in); 
			double result = 0;
			while(true){
				System.out.println("请输入商品单价：");
				double price = in.nextDouble();
				System.out.println("请输入商品数量：");
				int num = in.nextInt();
				System.out.println("请选择优惠方式：");
				int type = in.nextInt();
				Price numberPrice = PriceFactory.createPrice(price, num, type);
				result += numberPrice.getPrice();
				System.out.println("结果是：" + result);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
