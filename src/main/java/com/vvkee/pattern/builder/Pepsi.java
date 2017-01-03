package com.vvkee.pattern.builder;

/**
 * 百事可乐
 * 
 * @author xuhaifei
 *
 */
public class Pepsi extends ColdDrink {

	@Override
	public String name() {
		return "Pepsi";
	}

	@Override
	public float price() {
		return 9.0f;
	}

}
