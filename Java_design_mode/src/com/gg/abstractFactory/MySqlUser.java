package com.gg.abstractFactory;

public class MySqlUser implements IUser{

	@Override
	public IUser createIUser() {
		System.out.println("mysql createIUser");
		return null;
	}

	@Override
	public IUser getIUser(int userId) {
		System.out.println("mysql getIUser");
		return null;
	}

}
