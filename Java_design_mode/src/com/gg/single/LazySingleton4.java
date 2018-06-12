package com.gg.single;

import java.io.Serializable;

/**
 * 可以序列化的单例模式
 * @author shiweibo
 *
 * 2018年5月8日
 */
public class LazySingleton4 implements Serializable {

	 /**
	 * 
	 */
	private static final long serialVersionUID = -716076332907813247L;
	private static boolean initialized = false;//防止反射破坏单例
	    private LazySingleton4() {
	        synchronized (LazySingleton4.class) {
	            if (initialized == false) {
	                initialized = !initialized;
	            } else {
	                throw new RuntimeException("单例已被破坏");
	            }
	        }
	    }
	    static class SingletonHolder {
	        private static final LazySingleton4 instance = new LazySingleton4();
	    }
	    public static LazySingleton4 getInstance() {
	        return SingletonHolder.instance;
	    }
	    //可以防止序列化的时候破坏单例
	    private Object readResolve() {
	        return getInstance();
	    }

}
