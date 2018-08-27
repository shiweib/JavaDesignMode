package com.gg.composite;

/**
 * 抽象对象
 * @author shiweibo
 *
 * 2018年6月19日
 */
public abstract class Component {

	protected String name;

	public Component(String name) {
		super();
		this.name = name;
	}
	
	public abstract void add(Component component);
	
	public abstract void remove(Component component);
	
	public abstract void display(int depth);
	
}
