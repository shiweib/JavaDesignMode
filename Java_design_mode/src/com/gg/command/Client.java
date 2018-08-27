package com.gg.command;

public class Client {

	public static void main(String[] args) {
		Barbecuer barbecuer = new Barbecuer();
		BakeMuttonCommand muttonCommand1 = new BakeMuttonCommand(barbecuer);
		BakeMuttonCommand muttonCommand2 = new BakeMuttonCommand(barbecuer);
		BakeChickenWingCommand chickenWingCommand = new BakeChickenWingCommand(barbecuer);
		Waiter waiter = new Waiter();
		
		waiter.setOrder(muttonCommand1);
		waiter.setOrder(muttonCommand2);
		waiter.setOrder(chickenWingCommand);
		waiter.notifyCommand();
	}
}
