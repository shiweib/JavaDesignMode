package com.gg.proxy;

public class MyTest {

	public static void main(String[] args) {
		// 目标对象
		ITarget target = new Target("目标");
		// 【原始的类型 class cn.itcast.b_dynamic.UserDao】
		System.out.println(target.getClass());

		// 给目标对象，创建代理对象
		ITarget proxy = (ITarget) new ProxyFactory(target).getProxyInstance();
		// class $Proxy0 内存中动态生成的代理对象
		System.out.println(proxy.getClass());

		// 执行方法 【代理对象】
		proxy.getName();
	}
}
