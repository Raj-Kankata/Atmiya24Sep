package Test;

public class Newtest {

	public static void main(String[] args) {
		PrivateAccessModifier_Example pe = new PrivateAccessModifier_Example();
		//pe.test();

		DefaultAccessModifierExample de = new DefaultAccessModifierExample();
		de.defaultTest();
		
		ProtectedExample pe1 = new ProtectedExample();
		pe1.PrintProtected();

	}
}
