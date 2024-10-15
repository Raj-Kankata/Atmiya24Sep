
public class AdvFunctions {

	public static void main(String[] args) {
		AdvFunctions af = new AdvFunctions();
		 af.add(12, 23);
		 int sum = af.test(100,200);
		 System.out.println("sum of test "+sum);

	}
	
	public void add(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
	
	public int test(int d, int e) {
		int f=d+e;
		System.out.println(f);
		return f;
	}
}
