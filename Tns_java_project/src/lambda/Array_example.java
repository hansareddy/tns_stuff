package lambda;


import java.util.ArrayList;

public class Array_example {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		
		//lambda exp
		l.forEach(n->System.out.println(n));

	}

}