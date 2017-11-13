package com.koko.design.patterns.behavioral.observer;

import java.util.ArrayList;

public class Loan implements Subject {
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private String type;
	private float interest;
	private String bank;

	public Loan(String type, float interest, String bank) {
		this.type = type;
		this.interest = interest;
		this.bank = bank;
	}

	public float getInterest() {
		return interest;
	}

	public void setInterest(float interest) {
		this.interest = interest;
		notifyObservers();
	}

	public String getBank() {
		return this.bank;
	}

	public String getType() {
		return this.type;
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);

	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);

	}

	@Override
	public void notifyObservers() {
		System.out.println("Notifying Observers on change in Loan interest rate\n");
		for (Observer ob : observers) {
			ob.update(this.interest);
		}
	}

}
