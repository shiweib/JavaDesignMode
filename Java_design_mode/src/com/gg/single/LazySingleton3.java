package com.gg.single;

import java.io.Serializable;

/**
 * 可以反射的单例模式
 * @author shiweibo
 *
 * 2018年5月8日
 */
public class LazySingleton3 implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1836059176782414108L;
	private static boolean initialized = false;
    private LazySingleton3() {
        synchronized (LazySingleton3.class) {
            if (initialized == false) {
                initialized = !initialized;
            } else {
                throw new RuntimeException("单例已被破坏");
            }
        }
    }
    static class SingletonHolder {
        private static final LazySingleton3 instance = new LazySingleton3();
    }
    public static LazySingleton3 getInstance() {
        return SingletonHolder.instance;
    }

}
