package com.gg.Factory;

public class OperationFactorySub implements OperationFactory{

	@Override
	public Operation createOPerate(double numberA, double numberB) {
		return new OperationSub(numberA, numberB);
	}

}
