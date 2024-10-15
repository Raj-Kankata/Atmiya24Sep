package Test2;

import Test.ProtectedExample;

public class ProtectedTest extends ProtectedExample{

	public static void main(String[] args) {
		ProtectedExample pe1 = new ProtectedExample();
		//pe1.PrintProtected();
		
		ProtectedTest pt1 = new ProtectedTest();
		pt1.PrintProtected();

	}

}
