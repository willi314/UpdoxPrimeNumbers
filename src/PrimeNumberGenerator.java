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
		return true;
	}

}
