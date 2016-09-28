
import java.util.Scanner;

public class Reflex
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		// finish the following; comments explain how

		StdOut.println("Press ENTER twice, as quickly as you can:");
		System.out.println("...");
		
		// read ENTER from user (waiting for input)
		StdIn.readLine();
	
		// get current time in millis
		double firstpress = System.currentTimeMillis();

		// read 2nd ENTER from user (waiting for input)
		StdIn.readLine();
		
		// get later time in millis
		double secondpress = System.currentTimeMillis();
		
		// print answer: later time - earlier time
		double difference = secondpress - firstpress;
		
		System.out.println("Total " + difference);
	}
}
