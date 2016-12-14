package com.vvkee.pattern.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1 == s2);
		
		Singleton2 s3 = Singleton2.getInstance();
		Singleton2 s4 = Singleton2.getInstance();
		System.out.println(s3 == s4);

		ExecutorService executor = Executors.newFixedThreadPool(50);
		for (int i = 0; i < 1000; i++) {
			executor.execute(new Runnable() {

				@Override
				public void run() {
					
				}
			});
		}
	}
}
