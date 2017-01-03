package com.vvkee.pattern.builder;

/**
 * 鸡肉汉堡
 * 
 * @author xuhaifei
 *
 */
public class ChickenBurger extends Burger {

	@Override
	public String name() {
		return "ChickenBurger";
	}

	@Override
	public float price() {
		return 20.5f;
	}

}
