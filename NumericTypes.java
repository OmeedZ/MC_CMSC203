import java.util.Scanner;

/**
   This program demonstrates how numeric types and operators behave in Java
*/
public class NumericTypes {
	public static void main (String [] args) {
		Scanner scanner=new Scanner(System.in);
		//identifier declarations
		final int NUMBER = 2; // number of scores
		final double score1; // first test score
		final double score2; // second test score
		final int BOILING_IN_F = 212; // boiling temperature
		double fToC; // temperature in Celsius
		double average; // arithmetic average
		String output; // line of output to print out
		//Task #2 declare a variable to hold the user’s temperature
		System.out.println("Enter score1");
		score1=Integer.parseInt(scanner.nextLine());
		System.out.println("Enter score2");
		score2=Integer.parseInt(scanner.nextLine());
		// Find an arithmetic average
		average = (score1 + score2) / NUMBER;
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		// Convert Fahrenheit temperatures to Celsius
		fToC = (5/9.0) * (BOILING_IN_F - 32.0);
		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
		System.out.println(output);
		double fahrenheit;
		System.out.println("print temperature in F");
		fahrenheit=Double.parseDouble(scanner.nextLine());
		double Converted=(5/9.0) * (fahrenheit - 32.0);
		output=fahrenheit+" in Fahrenheit is " +Converted+ " in Celcius";
		System.out.println(output);
		System.out.println("Goodbye"); // to show that the program is ended	
	}
}