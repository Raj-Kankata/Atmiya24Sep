package Test;

public class ProtectedExample {

	public static void main(String[] args) {
		ProtectedExample pe1 = new ProtectedExample();
		pe1.PrintProtected();

	}
	
	protected void PrintProtected() {
		System.out.println("Protected Example");
	}

}
