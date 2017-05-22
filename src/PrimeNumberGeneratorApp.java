import java.util.Scanner;

public class PrimeNumberGeneratorApp {

	public static void main(String[] args) {
		Scanner consoleInput = new Scanner(System.in);
		PrimesGenerator generator = new PrimesGenerator();
		
		System.out.println("Enter -1 at any time to exit.");
		while(true){
			System.out.print("Enter range start: ");
			while (!consoleInput.hasNextInt()) {
				   System.out.println("Please enter a valid integer");
				   consoleInput.nextLine();
			}
			int startingValue = consoleInput.nextInt();
			if(startingValue == -1) break; 
			System.out.print("Enter range end: ");
			while (!consoleInput.hasNextInt()) {
				   System.out.println("Please enter a valid integer");
				   consoleInput.nextLine();
			}
			int endingValue = consoleInput.nextInt();
			if(endingValue == -1) break;		
			System.out.println("Prime numbers between " + startingValue + " and " + endingValue + ": " + generator.generate(startingValue, endingValue).toString());
		}
		consoleInput.close();
	}
}
