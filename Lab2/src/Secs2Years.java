import java.util.Scanner;

public class Secs2Years {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the time in seconds: ");
		
		int seconds = input.nextInt();
		
		int remainderseconds = seconds % 60;
		
		int minutes = seconds / 60;
		
		int remainderminutes = minutes % 60;
		
		int hours = minutes / 60;
		
		int remainderhours = hours % 60;
	
		int days = minutes / 1440;
		
		int remainderdays = days % 1440;
		
		int years = days / 365;
		
		System.out.println("Years: " + years + ", Days: " + remainderdays + 
   ", Hours: " + remainderhours + ", Minutes: " + remainderminutes + 
   ", Seconds: " + remainderseconds);
		
	}

}
