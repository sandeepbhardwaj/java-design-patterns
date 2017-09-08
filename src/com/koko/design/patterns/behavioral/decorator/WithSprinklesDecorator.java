package com.koko.design.patterns.behavioral.decorator;

//Decorator WithSprinkles mixes sprinkles onto coffee.
//Note it extends CoffeeDecorator.
public class WithSprinklesDecorator extends CoffeeDecorator {
	public WithSprinklesDecorator(Coffee c) {
		super(c);
	}

	public double getCost() {
		return super.getCost() + 0.2;
	}

	public String getIngredients() {
		return super.getIngredients() + ", Sprinkles";
	}
}
