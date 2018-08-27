package com.gg.state;

public class ConcreteStateB extends State{

	@Override
	public void handle(Context context) {
		if(context.getState().getType().equals("2")){
			System.out.println("执行状态2");
		}else{
			System.out.println("执行状态3");
		}
		
	}

}
