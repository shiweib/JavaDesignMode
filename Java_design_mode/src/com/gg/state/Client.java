package com.gg.state;

public class Client {

	public static void main(String[] args) {
		Context context = new Context(new ConcreteStateA());
		context.getState().setType("1");
		context.request();
		context.getState().setType("2");
		context.request();
		context.getState().setType("3");
		context.request();
		context.request();
	}
}
