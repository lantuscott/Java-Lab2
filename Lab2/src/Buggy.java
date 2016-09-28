// fix the following code
// for each bug you fix, add a comment that indicates syntax, runtime, or logical
//	example is shown

import java.util.Scanner;

public class Buggy
{
	  public static void main(String[] args) { //Semantic, added void and []. 
		    Scanner input = new Scanner(System.in); //Semantic, imported Scanner above and closed import.

		    System.out.print("Enter a degree in Celsius: "); // Syntax, added ". Logic, should ask for Celsius not Fahrenheit 
		    double celsius = input.nextDouble();  // Syntax, added ;.

		    //Convert Celsius to Fahrenheit 
		    double fahr = (9.0 / 5.0) * celsius + 32; //syntax, celsius was mispelled. Logic, should add 32 and 9/5 needed to be in decimals.
		    System.out.println("Celsius " + celsius + " is " 
		    		+ fahr + " in Fahrenheit "); //syntax, missing +.
		    		
		    	// System.out.println (1/0); is a logic error, can't divide by 0.
		    	// System.out.println (1.0/0.0);
		    input.close();
		  }
	//syntax, extra }
	//syntax, extra }
}