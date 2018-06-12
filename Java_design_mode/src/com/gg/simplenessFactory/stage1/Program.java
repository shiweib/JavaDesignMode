package com.gg.simplenessFactory.stage1;

import java.util.Scanner;

/**
 * 简单工厂，计算器
 * 业务逻辑和界面逻辑没有分开
 * @author shiweibo
 *
 * 2018年6月12日
 */
public class Program {

	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in); 
			System.out.println("请输入数字A：");
			double numberA = in.nextDouble();
			System.out.println("请选择运算符号：(+、-、*、/)：");
			String operate = in.next();
			System.out.println("请输入数字B：");
			double numberB = in.nextDouble();
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
			default:
				throw new Exception("输入错误");
			}
			System.out.println("结果是：" + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
