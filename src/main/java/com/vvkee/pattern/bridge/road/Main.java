package com.vvkee.pattern.bridge.road;

public class Main {

	public static void main(String[] args) {
		Car bus = new Bus();
		Road road = new SpeedRoad(bus);
		road.run();
		
		
		System.out.println();
		
		Car benz = new Benz();
		road = new SpeedRoad(benz);
		road.run();
	}

}
