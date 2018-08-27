package com.gg.component.stage2;

public class MyTest {

	public static int num = 0;
	
	public static void main(String[] args) {
		Pancake tornCake = new TornCake("手抓饼");
        //手抓饼基础价
        System.out.println(String.format("%s ￥%s", tornCake.getDesc(), tornCake.price()));
        
        Pancake roujiamo = new Roujiamo("肉夹馍");
        roujiamo = new FiredEgg(roujiamo);
        roujiamo = new FiredEgg(roujiamo);
        roujiamo = new Ham(roujiamo);
        //我好饿
        System.out.println(String.format("%s ￥%s", roujiamo.getDesc(), roujiamo.price()));
        //desc 执行顺序
	}
}
