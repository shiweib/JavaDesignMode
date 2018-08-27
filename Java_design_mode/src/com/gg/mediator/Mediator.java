package com.gg.mediator;

/**
 * 抽象中介者
 * @author shiweibo
 *
 * 2018年6月20日
 */
public abstract class Mediator {

	public abstract void send(String message,Colleague colleague);
}
