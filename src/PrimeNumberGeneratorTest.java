import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeNumberGeneratorTest {

	@Test
	public void TwoIsAPrimeNumber() {
		PrimeNumberGenerator generator = new PrimeNumberGenerator();
		assertEquals(true, generator.isPrime(2));
	}
	
	@Test
	public void OneIsNotAPrimeNumber(){
		PrimeNumberGenerator generator = new PrimeNumberGenerator();
		assertEquals(false, generator.isPrime(1));
	}

}
