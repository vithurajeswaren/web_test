package test_Case;

import static org.junit.Assert.*;

import org.junit.Test;

public class test_case03 {

	@Test
	public void test() {
    test_example object = new test_example();
		
		boolean output= object.isValid("");
		
		assertEquals(true, output );
	}

}
