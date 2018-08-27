package com.gg.Factory;

/**
 * 减法
 * @author shiweibo
 *
 * 2018年6月12日
 */
public class OperationSub extends Operation{

	public OperationSub(double numberA,double numberB) {
		super();
		setNumberA(numberA);
		setNumberB(numberB);
	}
	
	@Override
	public double getResult() {
		double result = getNumberA() - getNumberB();
		return result;
	}
}
