package com.vvkee.pattern.builder;

public class Main {
	public static void main(String[] args) {
		MealBuilder builder = new MealBuilder();
		
		Meal vegMeal = builder.prepareVegMeal();
		System.out.println("vegMeal");
		System.out.println(vegMeal.cost());
		vegMeal.show();
		
		System.out.println("");
		
		Meal chickenMeal = builder.prepareChickenMeal();
		System.out.println("chickenMeal");
		System.out.println(chickenMeal.cost());
		chickenMeal.show();
	}
}
