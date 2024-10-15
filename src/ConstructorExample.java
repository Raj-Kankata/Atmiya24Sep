
public class ConstructorExample {

	//constructor
	public ConstructorExample() {
		System.out.println("constructor example");
	}
	
	//constructor with parameter
		public ConstructorExample(String st) {
			System.out.println(st);
		}
		//constructor with multiple parameter
				public ConstructorExample(int t) {
					System.out.println("number to print "+t);
				}
		
	public static void main(String[] args) {
		ConstructorExample ce1 = new ConstructorExample();
		ConstructorExample ce2 = new ConstructorExample(200);
		ConstructorExample ce3 = new ConstructorExample("java class");
		
		//ce.Print();

	}
	
	public void Print() {
		System.out.println("Print values");
	}
}
