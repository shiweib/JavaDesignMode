package com.gg.command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {

	private List<Command> commandList = new ArrayList<>();
	
	public void setOrder(Command command){
		if(command instanceof BakeChickenWingCommand){
			System.out.println("没有鸡翅");
		}else{
			commandList.add(command);
			System.out.println("增加订单" + BakeMuttonCommand.class.getSimpleName());
		}
	}
	
	public void cancelOrder(Command command){
		commandList.remove(command);
		System.out.println("取消订单");
	}
	
	public void notifyCommand(){
		for (Command command : commandList) {
			command.executeCommand();
		}
	}
}
