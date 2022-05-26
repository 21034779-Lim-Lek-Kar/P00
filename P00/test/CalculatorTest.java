import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	private int a, b, c;
	Calculator cal;
	
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		//used for initialization at the top and the other methods.
		cal = new Calculator();
		a = 4321;
		b = 1234;
		c = 0;
	}

	@After
	public void tearDown() throws Exception {
	
	}

	@Test
	public void testAdd() {
		//Arrange
		int a = 1234;
		int b = 8765;
		Calculator cal = new Calculator();
		
		//Act
		int actual = cal.add(a, b);
		
		//Assert
		int expected = 9999;
		assertEquals(actual, expected);
	}

	@Test
	public void testSubtract() {
		// this method used faci's method; initializing a b and c at the top.
		
		//Act
		int actual = cal.subtract(a, b);

		//Assert
		int expected = 3087;
		assertEquals(actual, expected);

		
	}

	@Test
	public void testMultiply() {
		//Arrange
		int a = 2345;
		int b = 3;
		Calculator cal = new Calculator();
		
		//Act
		int actual = cal.multiply(a, b);

		//Assert
		int expected = 7035;
		assertEquals(actual, expected);

	}

	@Test
	public void testDivide() {
		
		//Arrange
		int a = 9876;
		int b = 4;
		Calculator cal = new Calculator();
		
		//Act
		int actual = cal.divide(a, b);

		//Assert
		int expected = 2469;
		assertEquals(actual, expected);
		
		

	}

}
