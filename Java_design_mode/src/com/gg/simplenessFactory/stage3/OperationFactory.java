package com.gg.simplenessFactory.stage3;

public class OperationFactory {

	public static Operation createOPerate(String operate,double numberA,double numberB){
		Operation operation = null;
		switch (operate) {
		case "+":
			operation = new OperationAdd(numberA,numberB);
			break;
		case "-":
			operation = new OperationSub(numberA,numberB);
			break;
		case "*":
			operation = new OperationMul(numberA,numberB);
			break;
		case "/":
			operation = new OperationDiv(numberA,numberB);
			break;
		}
		return operation;
	}
}
