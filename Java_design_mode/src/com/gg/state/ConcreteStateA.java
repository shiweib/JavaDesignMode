package com.gg.state;

public class ConcreteStateA extends State{

	@Override
	public void handle(Context context) {
		if(context.getState().getType().equals("1")){
			System.out.println("执行状态1");
		}else{
			new ConcreteStateB().handle(context);
		}
	}

}
