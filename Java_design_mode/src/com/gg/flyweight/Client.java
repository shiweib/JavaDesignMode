package com.gg.flyweight;

public class Client {

	public static void main(String[] args) {
		int extrinsicstate = 22;
		FlyweightFactory factory = new FlyweightFactory();
		Flyweight fX = factory.getFlyweight("X");
		fX.Operation(--extrinsicstate);
		
		Flyweight fY = factory.getFlyweight("Y");
		fY.Operation(--extrinsicstate);
		
		Flyweight fZ = factory.getFlyweight("Z");
		fZ.Operation(--extrinsicstate);
		
		UnsharedConcreteFlyweight uf = new UnsharedConcreteFlyweight();
		uf.Operation(--extrinsicstate);
		
		
	}
}
