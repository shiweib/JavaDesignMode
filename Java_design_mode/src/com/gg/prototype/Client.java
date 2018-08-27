package com.gg.prototype;

public class Client {

	public static void main(String[] args) {
		ConcretePrototype1 prototype1 = new ConcretePrototype1("1");
		Prototype clone = prototype1.clone();
		
	}
}
