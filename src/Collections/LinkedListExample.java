package Collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<String> al = new LinkedList<String>();
		al.add("Selenium");
		al.add("Java");
		al.add("Python");
		al.add("UFT");
		al.add("UFT1");
		al.add("Python1");
		al.add("UFT2");
		al.add("UFT3");
		
		System.out.println(al.get(2));
				
		for(int i=0; i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("************************");
		
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("########################");
		
		LinkedList<String> al1 = new LinkedList<String>();
		//adding one or more elements using addAll()
		Collections.addAll(al1,"Core Java", "Ruby","Perl", "test");
		 Collections.sort(al1);
		 
		 for(int i=0; i<al1.size();i++) {
			 System.out.print(al1.get(i) + " ");
			 
		 }
		

	}

}
