package com.gg.component.stage2;

/**
 * 煎饼抽象类
 * @author shiweibo
 *
 * 2018年6月14日
 */
public abstract class Pancake {

	private String desc;

	public String getDesc() {
		System.out.println("Pancake :" + (MyTest.num++) );
		return desc;
	}
	
	

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public abstract double price();
}
