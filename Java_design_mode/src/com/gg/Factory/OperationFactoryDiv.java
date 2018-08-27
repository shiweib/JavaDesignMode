package com.gg.Factory;

public class OperationFactoryDiv implements OperationFactory{

	@Override
	public Operation createOPerate(double numberA, double numberB) {
		return new OperationDiv(numberA, numberB);
	}

}
