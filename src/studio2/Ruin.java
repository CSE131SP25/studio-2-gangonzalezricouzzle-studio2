package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is your starting amount of money?");
		double currentAmount = in.nextDouble();
		System.out.println("What is the win chance? (between 0-1)");
		double winChance = in.nextDouble();
		System.out.println("What is the win limit?");
		double winLimit = in.nextDouble();
		System.out.println("What is the number of day's you'll simulate?");
		int totalSimulation = in.nextInt();

		for (int days = 0; days <= totalSimulation; days++) {
			while (currentAmount < winLimit && currentAmount >= 0) {
				double rnd = Math.random();
				if (rnd >= winChance) {
					currentAmount = currentAmount++;
				} else {
					currentAmount = currentAmount--;
				}
			}
			if (currentAmount == winLimit) {
				System.out.println("WON");
			} else {
				System.out.println("LOST");
			}

		}

	}

}
