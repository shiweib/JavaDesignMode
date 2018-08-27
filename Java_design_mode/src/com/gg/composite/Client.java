package com.gg.composite;

public class Client {

	public static void main(String[] args) {
		Composite root = new Composite("root");
		root.add(new Leaf("leaf a"));
		root.add(new Leaf("leaf b"));
		
		Composite composite = new Composite("composite x");
		composite.add(new  Leaf("leaf Xa"));
		composite.add(new  Leaf("leaf Xb"));
		root.add(composite);
		
		
		Composite composite2 = new Composite("composite xy");
		composite2.add(new  Leaf("leaf Xya"));
		composite2.add(new  Leaf("leaf Xyb"));
		composite.add(composite2);
		
		
		root.add(new Leaf("leaf c"));
		Leaf leafd = new Leaf("leaf d");
		root.add(leafd);
		root.remove(leafd);
		
		root.display(1);
	}
}
