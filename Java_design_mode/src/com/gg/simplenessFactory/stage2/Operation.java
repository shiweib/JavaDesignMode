package com.gg.simplenessFactory.stage2;

/**
 * 计算类
 * 专注于业务：计算
 * @author shiweibo
 *
 * 2018年6月12日
 */
public class Operation {

	public static double getResult(double numberA,String operate,double numberB) throws Exception{
		double result = 0;
		switch (operate) {
		case "+":
			result = numberA + numberB;
			break;
		case "-":
			result = numberA - numberB;
			break;
		case "*":
			result = numberA * numberB;
			break;
		case "/":
			if(numberB == 0){
				throw new Exception("除数不能为0");
			}
			result = numberA / numberB;
			break;
		}
		return result;
	}
}
