package Exceptions;

public class MultipleCatchExample {

	public static void main(String[] args) {

		try {
		int a[]=new int[5];
		a[5]=30/5;
		a[6]=30/5;
		a[7]=30/5;
		
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		}
		catch(Exception e)
		{
			System.out.println("Parent Exception occurs");
		}
		System.out.println("new test");
		
		
		

	}

}
