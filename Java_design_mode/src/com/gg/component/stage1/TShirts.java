package com.gg.component.stage1;

public class TShirts extends Finery{

	
	
	

	public TShirts(String name,Person person) {
		super(name);
		setPerson(person);
	}

	@Override
	public void show() {
		System.out.println("大T恤 ");
		
	}

}
