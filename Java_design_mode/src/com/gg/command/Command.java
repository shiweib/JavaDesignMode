package com.gg.command;

/**
 * 命令抽象类
 * @author shiweibo
 *
 * 2018年6月20日
 */
public abstract class Command {

	protected Barbecuer receiver;

	public Command(Barbecuer receiver) {
		super();
		this.receiver = receiver;
	}
	
	public abstract void executeCommand();
}
