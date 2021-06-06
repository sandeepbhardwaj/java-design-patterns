package com.koko.design.patterns.behavioral.decorator;

public class Main {
	public static void printInfo(Coffee c) {
		System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());
	}

	public static void main(String[] args) {
		Coffee c = new SimpleCoffee();
		printInfo(c);

		c = new WithMilkDecorator(c);
		printInfo(c);

		c = new WithSprinklesDecorator(c);
		printInfo(c);
	}
}
