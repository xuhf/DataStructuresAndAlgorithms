package com.vvkee.pattern.singleton;

/**
 * 单例模式
 * 
 * 饿汉模式
 * 
 * 线程安全
 * 
 * @author xuhf
 *
 */
public class Singleton {

	private Singleton() {
	}

	private static Singleton instance = new Singleton();

	public static Singleton getInstance() {
		return instance;
	}

}
