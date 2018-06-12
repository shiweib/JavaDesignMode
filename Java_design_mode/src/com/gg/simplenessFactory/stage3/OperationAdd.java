package com.gg.simplenessFactory.stage3;

/**
 * 加法
 * @author shiweibo
 *
 * 2018年6月12日
 */
public class OperationAdd extends Operation{

	
	
	public OperationAdd(double numberA,double numberB) {
		super();
		setNumberA(numberA);
		setNumberB(numberB);
	}

	@Override
	public double getResult() {
		double result = getNumberA() + getNumberB();
		return result;
	}
}
