package com.vvkee.pattern.builder;

/**
 * 汉堡类
 * 
 * @author vvkee
 *
 */
public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	public abstract float price();

}
