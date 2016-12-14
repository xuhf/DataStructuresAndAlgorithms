package com.vvkee.pattern.singleton;

/**
 * 懒汉模式的单例模式
 * 
 * 存在的问题，会造成线程不安全
 * 
 * @author xuhf
 *
 */
public class Singleton2 {

	private Singleton2() {
		System.out.println("Singleton2 init .........");
	}

	private static Singleton2 instance = null;

	public static Singleton2 getInstance() {
		if (instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}

}
