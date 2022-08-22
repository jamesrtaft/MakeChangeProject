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
			System.out.println("Not enough tendered");
		} else if (amt == price) {
			System.out.println("Exact change!!!");
		}

		else {
			change = amt - price;
			System.out.println("Your change is: ");
		} if (change > 20) {
			double twenties = change / 20;
			System.out.println(twenties + " twenties" );
		} else if (change > 10) {
			double tens = change /10;
			System.out.println(tens + " tens");
		} else if (change > 5) {
			double fives = change /5;
			System.out.println(fives + " fives");
		} else if (change > 1) {
			double ones = change / 1;
			System.out.println(ones + " ones");
		 
		}
	}

}
