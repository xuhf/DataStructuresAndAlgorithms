package com.vvkee.pattern.builder;

/**
 * 冷饮类
 * 
 * @author xuhaifei
 *
 */
public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

	public abstract float price();

}
