package com.gg.mediator;

/**
 * 抽象同事类
 * @author shiweibo
 *
 * 2018年6月20日
 */
public abstract class Colleague {

	protected Mediator mediator;

	public Colleague(Mediator mediator) {
		super();
		this.mediator = mediator;
	}
	
	
}
