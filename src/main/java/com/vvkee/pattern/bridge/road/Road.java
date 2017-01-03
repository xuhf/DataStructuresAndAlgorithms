package com.vvkee.pattern.bridge.road;

public abstract class Road {

	Car car;

	public Road(Car car) {
		this.car = car;
	};

	public abstract void run();

}
