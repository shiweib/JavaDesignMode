package com.gg.proxy;

public class Target implements ITarget{

	private String name;

	public Target(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		System.out.println("目标类");
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
