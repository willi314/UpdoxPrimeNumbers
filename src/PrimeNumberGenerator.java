import java.util.*;

public class PrimeNumberGenerator implements PrimeNumberGeneratorInterface{

	@Override
	public List<Integer> generate(int startingValue, int endingValue) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		return list;
	}

	@Override
	public boolean isPrime(int value) {
		if(value == 1) return false;
		if(this.isEven(value)) return false;
		for(int i = 3; i * i <= value; i += 2)
	        if (value % i == 0) 
	            return false;
		return true;
	}
	
	private boolean isEven(int value){
		return value > 2 && (value & 1) == 0;
	}
}
