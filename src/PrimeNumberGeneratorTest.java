import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PrimeNumberGeneratorTest {

	PrimeNumberGenerator generator;
	
	@Before
	public void init(){
		generator = new PrimeNumberGenerator();
	}
	
	@Test
	public void TwoIsAPrimeNumber() {
		assertTrue(generator.isPrime(2));
	}
	
	@Test
	public void OneIsNotAPrimeNumber(){
		assertFalse(generator.isPrime(1));
	}
	
	@Test
	public void TwoIsTheOnlyPrimeNumberFromOneToTwo(){
		assertEquals("[2]", generator.generate(1, 2).toString());
	}
	
	@Test
	public void ThreeIsAPrimeNumber(){
		assertTrue(generator.isPrime(3));
	}
	
	@Test
	public void FourIsNotAPrime(){
		assertFalse(generator.isPrime(4));
	}

	@Test
	public void NineIsNotPrime(){
		assertFalse(generator.isPrime(9));
	}
}
