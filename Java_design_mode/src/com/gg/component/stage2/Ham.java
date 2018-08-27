package com.gg.component.stage2;

public class Ham extends Condiment{

	private Pancake pancake;
	
	public Ham(Pancake pancake) {
		super();
		this.pancake = pancake;
	}

	@Override
	public String getDesc() {
		System.out.println("Ham :" + (MyTest.num++) );
		return pancake.getDesc() + ",火腿片";
	}

	@Override
	public double price() {
		return pancake.price() + 1.5;
	}

}
