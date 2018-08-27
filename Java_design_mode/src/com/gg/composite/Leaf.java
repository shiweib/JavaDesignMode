package com.gg.composite;

/**
 * 叶子节点
 * @author shiweibo
 *
 * 2018年6月19日
 */
public class Leaf extends Component{

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {
		System.out.println("cannot add to a leaf");
	}

	@Override
	public void remove(Component component) {
		System.out.println("cannot remove from a leaf");
	}

	@Override
	public void display(int depth) {
		System.out.println(name + "--depth : "+ depth);
	}

}
