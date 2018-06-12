package com.gg.single;

/**
 * 不能防止反射，序列化的单例模式，但是懒加载，不是用同步，
 * 静态内部类会在调用getInstance 的时候加载，其他时候不会加载
 * @author shiweibo
 *
 * 2018年5月8日
 */
public class LazySingleton2 {

	private LazySingleton2() {//
	}

	static class SingletonHolder {
        private static final LazySingleton2 instance = new LazySingleton2();
    }
    public static LazySingleton2 getInstance() {
        return SingletonHolder.instance;
    }
}
