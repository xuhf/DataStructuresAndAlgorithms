package com.vvkee.pattern.builder;

/**
 * 可口可乐
 * 
 * @author xuhaifei
 *
 */
public class Coke extends ColdDrink {

	@Override
	public String name() {
		return "Coke";
	}

	@Override
	public float price() {
		return 8.0f;
	}

}
