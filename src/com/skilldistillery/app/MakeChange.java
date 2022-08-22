package com.skilldistillery.app;

import java.text.NumberFormat;
import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {

		double price = 0;
		double amt = 0;
		double change = 0;

		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);

		System.out.println("Please enter the item's price below: ");
		Scanner sc = new Scanner(System.in);
		price = sc.nextDouble();
		System.out.println("Please enter the amount tendered below: ");
		amt = sc.nextDouble();

		if (amt < price) {
			System.out.println("I pity da fool that don't pay enough!!!");
		} else if (amt == price) {
			System.out.println("Check out the big brain on Brett...");
		}

		else {
			change = amt - price;
			System.out.println("Your change is: $" + nf.format(change));
		} if (change > 20) {
			double twenties = change / 20;
			System.out.println(twenties + " twenties");
		} else if (change > 10) {
			double tens = change /10;
			System.out.println(tens + " tens");
		}
	}

}

//Grading
//This is a graded project. You are expected to have your project completed by the start of class on Monday morning.
//
//You will be given either a pass or fail based on whether your code works given all of the following test conditions:
//
//Amount: .67, Tendered: .50, Result: Error message
//Amount: .67, Tendered: 1.00, Result: 1 quarter, 1 nickel, 3 pennies.
//Amount: .59, Tendered: 1.00, Result: 1 quarter, 1 dime, 1 nickel, 1 penny.
//Amount: 3.96, Tendered: 20.00, Result: 1 ten dollar bill, 1 five dollar bill, 1 one dollar bill, 4 pennies.
//Amount: any amount less than 20.00, Tendered: anything greater than amount: correct denominations for correct change.
//If the project does work with all of the above test conditions, you will be given a 1 for this week's project.
//
//If the project does not work with the above test conditions, you will be given a 0 for this week's project.
//
//If you get a zero on the project, you can upgrade to a score of .5 if you turn in a working project by the start of class on the following Monday morning AND notify an instructor that you wish to get partial credit.
//
//To turn in a project, you must push it to GitHub. You must include a README.md that describes how to run your program.
