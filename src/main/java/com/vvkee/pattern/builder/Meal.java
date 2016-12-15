package com.vvkee.pattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 一餐
 * 
 * @author xuhaifei
 *
 */
public class Meal {

	private List<Item> items = new ArrayList<Item>();

	public void addItem(Item item) {
		items.add(item);
	}

	public float cost() {
		float total = 0.0f;
		for (Item item : items) {
			total += item.price();
		}
		return total;
	}

	public void show() {
		for (Item item : items) {
			System.out.print("Item : " + item.name());
			System.out.print(", Packing : " + item.packing().pack());
			System.out.println(", Price : " + item.price());
		}
	}

}
