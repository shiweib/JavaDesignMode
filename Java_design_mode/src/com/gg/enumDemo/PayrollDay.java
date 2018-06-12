package com.gg.enumDemo;
/**
 * 工资枚举类
 * 需要计算工资
 * 
 * 多个枚举常量同时共享相同的行为
 * @author shiweibo
 *
 * 2018年6月4日
 */
public enum PayrollDay {
	MONDAY(PayType.WEEKDAY),
	TUESDAY(PayType.WEEKDAY),
	WEDNESDAY(PayType.WEEKDAY),
	THURSDAY(PayType.WEEKDAY),
	FRIDAY(PayType.WEEKDAY),
	
	SATURDAY(PayType.WEEKEND),
	SUNDAY(PayType.WEEKEND);
	private final PayType payType;//指定工资的计算方式，这个也是枚举的，这样当有新的枚举是，不会出现没有对应的工资计算方式，这是一个策略枚举
	private PayrollDay(PayType payType) {
		this.payType = payType;
	}
	
	/**
	 * 计算工资
	 * @param hoursWorked
	 * @param payRate
	 * @return
	 */
	double pay(double hoursWorked,double payRate){
		return payType.pay(hoursWorked, payRate);
	}
	
	private enum PayType{
		WEEKDAY{
			double overtimePay(double hours,double payRate){
				return hours <= HOURS_PER_SHIFT ? 0 : 
					(hours - HOURS_PER_SHIFT) * payRate / 2;
			};
		},
		WEEKEND{
			double overtimePay(double hours,double payRate){
				return hours * payRate / 2;
			};
		};
		private static final int HOURS_PER_SHIFT = 8;
		abstract double overtimePay(double hrs,double payRate);
		double pay(double hoursWorked,double payRate){
			double basePay = hoursWorked * payRate;
			return basePay + overtimePay(hoursWorked, payRate);
		}
		
	}
}
