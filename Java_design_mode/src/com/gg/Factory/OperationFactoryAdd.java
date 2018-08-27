package com.gg.Factory;

public class OperationFactoryAdd implements OperationFactory{

	@Override
	public Operation createOPerate(double numberA, double numberB) {
		return new OperationAdd(numberA, numberB);
	}

}
