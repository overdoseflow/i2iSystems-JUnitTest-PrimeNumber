package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class isPrimeTest {

	@Test
	void test() {
		PrimeJunitTesting test = new PrimeJunitTesting();
		boolean output = test.isPrime(19);
		assertEquals(true,output);
	}

}
