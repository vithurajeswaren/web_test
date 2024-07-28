package test_Case;

public class test_example {

	public int square(int n) {
		return n*n;
		}
	
	public int sum(int a, int b) {
		return a+b;
	}
	
	public boolean isValid(String password) {
		
		if (password.length()>=1 && password.length ()<=10) {
			return true;
			
		}else 
			return false;
		
	}
	
	boolean notnullString(String password) {
		
		if (password != null ) {
			return true;
			
		}else 
			return false;
	
	}
	
	
boolean exam(String password) {
		
		if (password != null ) {
			return true;
			
		}else 
			return false;
	
	}
	
	
	
	
	
}
