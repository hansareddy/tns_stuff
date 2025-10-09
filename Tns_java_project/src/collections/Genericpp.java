package collections;

public class Genericpp {

	public static void main(String[] args) {
		Generic<Integer> g = new Generic<Integer>();
		
		g.setData(1);
		g.setData(2);
		
		System.out.println(g.getData());
		
		Generic<String> g1 = new Generic<String>();
		g1.setData("hansa");
		System.out.println(g1.getData());

	}

}