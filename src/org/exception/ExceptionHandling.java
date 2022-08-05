package org.exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("Vignesh");
		try {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4/2);
		String s = "Java";
		char charAt = s.charAt(2);
		System.out.println(charAt);
		
		String s1= null;
		char charAt2 = s1.charAt(2);
		}	
		
	catch (ArithmeticException e) {
		System.out.println("Dont Divide By Zero");
	}
	catch (StringIndexOutOfBoundsException e) {
		System.out.println("Give Correct Index");
	}

		catch (Exception e) {
			System.out.println("Any Exception");
			e.printStackTrace();
}
	}
}
	
	
	
	
	
	

