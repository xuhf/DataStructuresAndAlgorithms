package com.vvkee.pattern.bridge.road;

public class CityRoad extends Road {

	public CityRoad(Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		System.out.print("城市街道->");
		car.run();
	}

}
