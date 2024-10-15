package Collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> hm = new Hashtable<Integer,String>();
		
		hm.put(100, "Raj1");
		hm.put(101, "Raj2");
		hm.put(102, "Raj3");
		hm.put(103, "Raj3");
		hm.put(105, "Raj4");
		
		for(Map.Entry m:hm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
