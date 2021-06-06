package com.koko.design.patterns.behavioral.observer;

public class Main {

	public static void main(String args[]) {
		// this will maintain all loans information
		Observer printMedia = new Newspaper();
		Observer onlineMedia = new Internet();

		Loan personalLoan = new Loan("Personal Loan", 12.5f, "Standard Chartered");
		personalLoan.registerObserver(printMedia);
		personalLoan.registerObserver(onlineMedia);
		personalLoan.setInterest(3.5f);

	}
}
