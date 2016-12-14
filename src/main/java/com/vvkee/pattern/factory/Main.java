package com.vvkee.pattern.factory;

public class Main {

	public static void main(String[] args) {
		Shade s = ShadeFactory.getShade("Rectangle");
		s.draw();
		s = ShadeFactory.getShade("Square");
		s.draw();
		s = ShadeFactory.getShade("Circle");
		s.draw();
	}
}
