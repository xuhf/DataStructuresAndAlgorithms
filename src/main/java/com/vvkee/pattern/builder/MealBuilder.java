package com.vvkee.pattern.builder;

/**
 * 一餐的建造者
 * 
 * 将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示
 * 
 * @author xuhaifei
 *
 */
public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareChickenMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}

}
