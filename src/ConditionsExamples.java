
public class ConditionsExamples {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		String st="Java Class";
		String st1="Selenium";
		System.out.println(a);
		System.out.println(b);
		System.out.println(st);
		System.out.println("************");
		System.out.println(a+b);
		System.out.println(st+a+b);
		System.out.println(a+b+st);
		System.out.println(st +"***"+ st1);

		int c=1000;
		int d=4000;

		if(c>d) {
			System.out.println("c is greater " +c);
		}else {
			System.out.println("d is greater " +d);
		}

		int e=3000;
		if(c>d & c>e) {
			System.out.println("c is greatest " +c);
		}else if(d>e){
			System.out.println("d is greatest " +d);
		}else {
			System.out.println("e is greatest " +e);
		}
	}

}
