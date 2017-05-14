import java.util.Scanner;

public class PrimeNumberGeneratorApp {

	public static void main(String[] args) {
		Scanner consoleInput = new Scanner(System.in);
		PrimesGenerator generator = new PrimesGenerator();
		
		System.out.println("Enter -1 at any time to exit.");
		while(true){
			System.out.print("Enter Range Start: ");
			int startingValue = consoleInput.nextInt();
			if(startingValue == -1) break; 
			System.out.print("Enter Range End: ");
			int endingValue = consoleInput.nextInt();
			if(endingValue == -1) break;		
			System.out.println("Prime numbers between " + startingValue + " and " + endingValue + ": " + generator.generate(startingValue, endingValue).toString());
		}
		consoleInput.close();
	}
}
