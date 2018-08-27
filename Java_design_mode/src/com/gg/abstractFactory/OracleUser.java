package com.gg.abstractFactory;

public class OracleUser implements IUser{

	@Override
	public IUser createIUser() {
		System.out.println("oracleUser createIUser");
		return null;
	}

	@Override
	public IUser getIUser(int userId) {
		System.out.println("oracleUser getIUser");
		return null;
	}

}
