package com.vvkee.pattern.bridge.road;

public class Bus implements Car {

	@Override
	public void run() {
		System.out.print(" 公共汽车 ->");
	}

}
