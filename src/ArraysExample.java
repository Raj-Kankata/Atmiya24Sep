
public class ArraysExample {

	public static void main(String[] args) {
		
		int a;
		
		//One dimensional
		int b[] = new int[3];
		b[0]=100;
		b[1]=200;
		b[2]=300;
		
		System.out.println(b[1]);
		
		for(a=0;a<3;a++) {
			System.out.print(b[a]);
			System.out.print(" ");
		}
		
		System.out.println();
System.out.println("**************************************************");

	//Two Dimensional array
		int c[][] = new int[2][3];
		c[0][0]=100;
		c[0][1]=200;
		c[0][2]=300;
		
		c[1][0]=400;
		c[1][1]=500;
		c[1][2]=600;
		
		for (int i=0; i<2; i++) { //i=0,1
			for(int j=0; j<3; j++) { //j=0,1,2 - j=0,1,2
				System.out.println(c[i][j]);
			}
		}
	}

}
