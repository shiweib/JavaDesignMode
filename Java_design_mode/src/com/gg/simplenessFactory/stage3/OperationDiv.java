package com.gg.simplenessFactory.stage3;

/**
 * 加法
 * @author shiweibo
 *
 * 2018年6月12日
 */
public class OperationDiv extends Operation{

	public OperationDiv(double numberA,double numberB) {
		super();
		setNumberA(numberA);
		setNumberB(numberB);
	}
	
	@Override
	public double getResult() {
		if(getNumberB() == 0){
			throw new RuntimeException("除数不能为0");
		}
		double result = getNumberA() / getNumberB();
		return result;
	}
}
