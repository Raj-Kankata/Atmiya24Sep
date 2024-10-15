
public class Parent extends Object {

	public static void main(String[] args) {
		
		Parent p1 = new Parent();
		p1.add();
		p1.sub();
		
	}
	
	public void add() {
		System.out.println("addition");
	}
	
	public void sub() {
		System.out.println("subtraction");
	}
	
	public void mul() {
		System.out.println("multiplication from parent class");
	}

}
