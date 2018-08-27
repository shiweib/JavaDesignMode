package com.gg.command;

/**
 * 烤鸡翅的命令
 * @author shiweibo
 *
 * 2018年6月20日
 */
public class BakeChickenWingCommand extends Command{

	public BakeChickenWingCommand(Barbecuer receiver) {
		super(receiver);
	}

	@Override
	public void executeCommand() {
		receiver.bakeChickenWing();
	}

}
