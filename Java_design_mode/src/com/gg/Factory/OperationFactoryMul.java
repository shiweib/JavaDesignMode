package com.gg.Factory;

public class OperationFactoryMul implements OperationFactory{

	@Override
	public Operation createOPerate(double numberA, double numberB) {
		return new OperationMul(numberA, numberB);
	}

}
