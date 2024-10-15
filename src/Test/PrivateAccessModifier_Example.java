package Test;

public class PrivateAccessModifier_Example {

	public static void main(String[] args) {
		
		PrivateAccessModifier_Example pe = new PrivateAccessModifier_Example();
		pe.test();

	}

	private void test() {
		System.out.println("Private Access");
	}
}
