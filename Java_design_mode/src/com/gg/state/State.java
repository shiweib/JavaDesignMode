package com.gg.state;



public abstract class State {
	
	private String type;
	
	public abstract void handle(Context context);

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
