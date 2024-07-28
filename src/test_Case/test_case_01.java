package test_Case;

import static org.junit.Assert.*;

import org.junit.Test;



public class test_case_01 {

	@Test
	public void test() {
		 
		test_example object = new test_example();
		
		int output= object.square(4);
		
		assertEquals(16, output );
			
			
		}
	
	

}
