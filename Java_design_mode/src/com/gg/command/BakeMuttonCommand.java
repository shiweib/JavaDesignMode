package com.gg.command;

/**
 * 烤羊肉的命令
 * @author shiweibo
 *
 * 2018年6月20日
 */
public class BakeMuttonCommand extends Command{

	public BakeMuttonCommand(Barbecuer receiver) {
		super(receiver);
	}

	@Override
	public void executeCommand() {
		receiver.bakeMuttomn();
	}

}
