import java.util.List;

public class PrimeNumberGenerator implements PrimeNumberGeneratorInterface{

	@Override
	public List<Integer> generate(int startingValue, int endingValue) {
		return null;
	}

	@Override
	public boolean isPrime(int value) {
		if(value == 1) return false;
		return true;
	}

}
