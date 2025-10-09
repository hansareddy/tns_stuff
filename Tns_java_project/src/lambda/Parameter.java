package lambda;

public class Parameter {

	public static void main(String[] args) {
		With_parameter w = (a) ->
		{
			System.out.println("The value of a is :" +a);
			return a;	
		};
		
		w.bla(5);

	}

}
