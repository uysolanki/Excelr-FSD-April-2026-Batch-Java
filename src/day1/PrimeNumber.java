package day1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int n1 = sc.nextInt(); // n1=7

		// start end n1
		// 1 2 3 4 5 6 7
		int counter = 0;
		for (int i = 1; i <= n1; i++) {
			if (n1 % i == 0) {
				counter++;
			}
		}

		if (counter == 2) {
			System.out.println(n1 + " number is Prime");
		} else {
			System.out.println(n1 + " number is Not Prime");
		}

	}

}
