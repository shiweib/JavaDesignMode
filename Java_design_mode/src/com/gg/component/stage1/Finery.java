package com.gg.component.stage1;

/**
 * 服饰类
 * @author shiweibo
 *
 * 2018年6月13日
 */
public abstract class Finery extends Person{

	public Finery(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	private Person person;
	
	public void setPerson(Person person) {
		this.person = person;
	}

	public abstract void show();
}
