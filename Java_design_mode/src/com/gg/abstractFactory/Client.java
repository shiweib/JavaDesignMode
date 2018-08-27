package com.gg.abstractFactory;

public class Client {

	public static void main(String[] args) {
		DataFactory dataFactory = new DataFactory();
		IUser createIUser = dataFactory.createIUser();
		dataFactory.getIUser(1);
	}
}
