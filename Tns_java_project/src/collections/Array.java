package collections;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList<>();
		
		a.add(1);
		a.add(101);
		a.add("shahsi");
		a.add(89.3); 
		System.out.println(a);
		a.remove(1);
		System.out.println(a);
		System.out.println(a.get(0));
		a.add("keerthi");
		a.add(null);
		a.add(101);
		System.out.println(a);
		
	}

}