package com.codechef.programs;

import java.util.Scanner;

public class ChefAndCardGame {

	public static void main(String[] args) {
		int test_cases = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter numbers of test cases: ");
		
		if(sc.hasNextInt())
			test_cases = sc.nextInt();

		for (int i = 0; i < test_cases; i++) {

			int chefs_score = 0;
			int mortys_score = 0;

			System.out.printf("How many rounds for test-case-%d: \n", i + 1);

			int rounds = sc.nextInt();

			int[] no_on_cards = new int[2];

			System.out.println("Enter numbers on Chef's and Morty'd cards :");

			for (int j = 0; j < rounds; j++) {

				for (int k = 0; k < 2; k++) {

					no_on_cards[k] = sc.nextInt();
				}

				int winner = checkWinner(no_on_cards[0], no_on_cards[1]);

				if (winner == 0) {
					chefs_score++;
				} else if (winner == 1) {
					mortys_score++;
				} else {
					chefs_score++;
					mortys_score++;
				}
			}

			if (chefs_score == mortys_score) {
				System.out.println("2 " + chefs_score);
			} else if (chefs_score > mortys_score) {
				System.out.println("0 " + chefs_score);
			} else {
				System.out.println("1 " + mortys_score);
			}
		}
	}

	public static int checkWinner(int chefs_no, int mortys_no) {

		int tmp = 0;
		int chefs_sum = 0;
		int mortys_sum = 0;

		while (chefs_no > 0) {

			tmp = chefs_no % 10;
			chefs_sum = chefs_sum + tmp;
			chefs_no = chefs_no / 10;
		}

		tmp = 0;

		while (mortys_no > 0) {

			tmp = mortys_no % 10;
			mortys_sum = mortys_sum + tmp;
			mortys_no = mortys_no / 10;
		}

		if (chefs_sum == mortys_sum) {
			return 2;
		} else if (chefs_sum > mortys_sum) {
			return 0;
		} else {
			return 1;
		}

	}

}
