package com.gg.abstractFactory;

public class DataFactory {

	private String db = "com.gg.abstractFactory.MySqlUser";
	
	public IUser createIUser(){
		try {
			Class<IUser> iUserClass = (Class<IUser>) Class.forName(db);
			IUser iUser = iUserClass.newInstance();
			return iUser.createIUser();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public IUser getIUser(int userId){
		try {
			Class<IUser> iUserClass = (Class<IUser>) Class.forName(db);
			IUser iUser = iUserClass.newInstance();
			return iUser.getIUser(userId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
