package com.vvkee.pattern.factory;

public class ShadeFactory {

	public static Shade getShade(String type) {
		if (type == null || type.equals("")) {
			return null;
		}
		Shade shade = null;
		if ("Rectangle".equals(type)) {
			shade = new Rectangle();
		} else if ("Square".equals(type)) {
			shade = new Square();
		} else if ("Circle".equals(type)) {
			shade = new Circle();
		}
		return shade;
	}

}
