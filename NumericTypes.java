/**
   This program demonstrates how numeric types and operators behave in Java
*/
import java.util.Scanner;
public class NumericTypes {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		//identifier declarations
		final int NUMBER = 2;		// number of score
		final int BOILING_IN_F = 212; // boiling temperature
		double fToC; // temperature in Celsius
		double average; // arithmetic average
		String output; // line of output to print out
		int userTemperature;

		System.out.println("Enter a score:");
		int score1 = sc.nextInt();

		System.out.println("Enter a second score:");
		int score2 = sc.nextInt();
		average = (score1 + score2)/ NUMBER;
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		// Convert Fahrenheit temperatures to Celsius
		fToC = (5.0/9.0) * (BOILING_IN_F - 32);
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		System.out.println("Enter a temperature in Fahrenheit: ");
		userTemperature = sc.nextInt();
		fToC = (5.0/9.0) * (userTemperature - 32);
		output = userTemperature + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		System.out.println("Goodbye"); // to show that the program is ended	
	}
}

