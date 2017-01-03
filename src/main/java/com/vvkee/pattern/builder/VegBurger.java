package com.vvkee.pattern.builder;

/**
 * 素食汉堡
 * 
 * @author xuhaifei
 *
 */
public class VegBurger extends Burger {

	@Override
	public String name() {
		return "VegBurger";
	}

	@Override
	public float price() {
		return 16.5f;
	}

}
