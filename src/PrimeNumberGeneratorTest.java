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
		assertEquals(true, generator.isPrime(2));
	}
	
	@Test
	public void OneIsNotAPrimeNumber(){
		assertEquals(false, generator.isPrime(1));
	}

}
