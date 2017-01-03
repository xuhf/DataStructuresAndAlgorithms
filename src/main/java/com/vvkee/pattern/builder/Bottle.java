package com.vvkee.pattern.builder;

/**
 * 使用瓶子包装
 * 
 * @author vvkee
 *
 */
public class Bottle implements Packing {

	@Override
	public String pack() {
		return "Bottle";
	}

}
