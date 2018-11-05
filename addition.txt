package week_2;

//created 2018-10-26 by Samuel Tschappler without any outside help

import java.util.Scanner;

public class addition {
	static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a 5-diget positive integer:");
		int num = scan.nextInt();

		System.out.println("The sum of the digets is:");
		int sum = 0;
		int functionNum = 0;

		// reverse the number of the integers in the list by grabbing remainder % 10
		while (num != 0) {
			functionNum = functionNum * 10 + num % 10;
			num = num / 10;

		}
		// reorder the values by doing the reverse to iterate through the number
		while (functionNum > 0) {
			System.out.print(functionNum % 10);
			sum = sum + (functionNum % 10);
			functionNum = functionNum / 10;
			// print out the integer then add a + after it to build up the sum on one line
			// not print line
			if (functionNum > 0) {
				System.out.print(" + ");
			}
		}
		System.out.println(" = " + sum);
	}

}


