package com.vvkee.pattern.singleton;

/**
 * 懒汉式单例模式的改进
 * 
 * http://blog.csdn.net/lanzhizhuxia/article/details/7924373
 * 
 * @author xuhf
 *
 */
public class Singleton3 {

	private Singleton3() {

	}

	public static Singleton3 getInstance() {
		Singleton3 instance = Singleton.instance;
		return instance;
	}

	private static class Singleton {
		private static Singleton3 instance = new Singleton3();
	}

}
