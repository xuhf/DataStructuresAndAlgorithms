package com.vvkee.pattern.bridge;

/**
 * 形状
 * 
 * @author xuhaifei
 *
 */
public abstract class Shape {
	protected DrawAPI drawApi;

	protected Shape(DrawAPI drawApi) {
		this.drawApi = drawApi;
	}

	public abstract void draw();

}
