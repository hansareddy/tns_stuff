package tns_package;

public class StaticFinal {
	
    static int count = 10;// static shared by all
    final int num = 100;// final cannot be changed

    public static void main(String[] args) {
    	
        StaticFinal obj = new StaticFinal();
        count=20;
        System.out.println("Static: " + StaticFinal.count);
        System.out.println("Final: " + obj.num);
    }
}
