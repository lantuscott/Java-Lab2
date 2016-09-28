
import java.util.Scanner; // Scanner is in the java.util package

public class ComputeAreaWithConsoleInput
{
	public static void main(String[] args)
	{
		// Create a Scanner object
//		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a radius
		StdOut.print("Enter a number for radius: "); // the user inputs a number
		double radius = StdIn.readDouble(); // StdIn reads that number

		// Compute area
		double area = radius * radius * 3.14159;

		// Display result
		StdOut.println("The area for the circle of radius " + radius + " is " + area);
	}
}
