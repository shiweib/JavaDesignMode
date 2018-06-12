package com.gg.enumDemo;

/**
 * 通过enum获取对应的int值
 * @author shiweibo
 *
 * 2018年6月4日
 */
public enum EnumInt {

	NUMBER1(1),
	NUMBER2(2),
	NUMBER3(3);
	
	private final int number;
	
	private EnumInt(int number){
		this.number = number;
	}

	public int getNumber() {
		return number;
	}
}
