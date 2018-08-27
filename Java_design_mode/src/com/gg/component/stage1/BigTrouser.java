package com.gg.component.stage1;

public class BigTrouser extends Finery{

	public BigTrouser(String name,Person person) {
		super(name);
		setPerson(person);
	}

	@Override
	public void show() {
		System.out.println("垮裤  ");
		
	}

}
