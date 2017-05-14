import java.util.*;

public class PrimesGenerator implements PrimeNumberGenerator{

	@Override
	public List<Integer> generate(int startingValue, int endingValue) {
		if(startingValue > endingValue) return this.generatePrimes(endingValue, startingValue);
		return this.generatePrimes(startingValue, endingValue);
	}

	@Override
	public boolean isPrime(int value) {
		if(value == 1) return false;
		if(this.isEven(value)) return false;
		for(int i = 3; i * i <= value; i += 2)
	        if (value % i == 0) return false;
		return true;
	}
	
	private List<Integer> generatePrimes(int startingValue, int endingValue) {
		ArrayList<Integer> primesList = new ArrayList<Integer>();
		for(int i = startingValue; i <= endingValue; i++){
			if(this.isPrime(i)) primesList.add(i);
		}
		return primesList;
	}
	
	private boolean isEven(int value){
		return value > 2 && (value & 1) == 0;
	}
}
