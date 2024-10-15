package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String[]> list = new ArrayList<String[]>();
		
		String name[] = {"raj", "kumar", "kankata"};
		String age[]  =	{"39","40","41"};
		
		list.add(name);
		list.add(age);
		
		for (String i[] : list) {
			System.out.println(Arrays.toString(i));
			
		}
		

	}

}
