package com.gg.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 子节点
 * @author shiweibo
 *
 * 2018年6月19日
 */
public class Composite extends Component{

	private List<Component> children = new ArrayList<>();
	
	public Composite(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {
		children.add(component);
		
	}

	@Override
	public void remove(Component component) {
		children.remove(component);
	}

	@Override
	public void display(int depth) {
		System.out.println(name + "--depth : "+ depth);
		for (Component component : children) {
			component.display(depth + 2); 
		}
	}

}
