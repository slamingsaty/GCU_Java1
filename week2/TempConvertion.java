
//created 2018-10-26 by Samuel Tschappler without any outside help

import java.util.Scanner;

public class TempConvertion {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Fahrenheit temperature:");

		float temp = scan.nextInt();
		float tempCel = (((temp - 32) * 5) / 9);

		System.out.println(temp + "F is the equivelent to " + tempCel + "C");
		System.out.println("Enter Celcius temperature");

		float temp1 = scan.nextInt();
		float tempFah = ((temp1 * 9) / 5) + 32;

		System.out.println(temp1 + "C is the equivelent to " + tempFah + "F");

		scan.close();
	}
}
