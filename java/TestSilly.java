import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSilly {

	
	@Before
	public void setUp() throws Exception {
	  //create objects here
	}

	@Test
	public void testSilly() {
		assertEquals(Silly.getNum(), 42);
	}
	
}
