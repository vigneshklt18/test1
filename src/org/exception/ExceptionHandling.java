package org.exception;

public class ExceptionHandling {

	public static void main(String[] args) {
//	................try and catch
//		
//		System.out.println(1);
//		System.out.println(2);
//		
//		try {
//			System.out.println(3/0);	
//		} catch (Exception e) {
//			System.out.println("Dont Divide By Zero");
//		}
//		
//		System.out.println(4);
//		
//	........... try & finally	
//	
//		System.out.println(1);
//		System.out.println(2);
//	try {
//		String s = "Java";
//		char charAt = s.charAt(5);
//		System.out.println(charAt);
//	} finally {
//		System.out.println("Done");
//	}	
//	System.out.println(3);
	
	
//...... try catch and finally
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
	
	
	
	
	
	

