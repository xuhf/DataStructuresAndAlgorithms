package com.vvkee.pattern.bridge.road;

public class SpeedRoad extends Road {

	public SpeedRoad(Car car) {
		super(car);
	}

	@Override
	public void run() {
		System.out.print("高速公路-->");
		car.run();
	}
}
