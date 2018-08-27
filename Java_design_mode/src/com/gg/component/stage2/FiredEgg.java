package com.gg.component.stage2;

public class FiredEgg extends Condiment{

	private Pancake pancake;
	
	public FiredEgg(Pancake pancake) {
		super();
		this.pancake = pancake;
	}

	@Override
	public String getDesc() {
		System.out.println("FiredEgg :" + (MyTest.num++) );
		return pancake.getDesc() + ",煎蛋";
	}

	@Override
	public double price() {
		return pancake.price() + 2;
	}
}
