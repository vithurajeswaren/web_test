package test_Case;

import static org.junit.Assert.*;

import org.junit.Test;

public class test_case02 {

	@Test
	public void test() {
	
		 
			test_example object = new test_example();
			
			int output= object.sum(4,5);
			
			assertEquals(10, output );
				
	}

}
