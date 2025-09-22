package tns_package;

public class Wrapperdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // Double
        Double a = 45.67;   //Autoboxing
        double b = a;    //Unboxing
        System.out.println("Double Boxed: " + a + " Unboxed: " + b);

        // Boolean
        Boolean c = false; 
        boolean d = c;
        System.out.println("Boolean Boxed: " + c + " Unboxed: " + d);

        // Character
        Character char1 = 'X'; 
        char char2 = char1;
        System.out.println("Character Boxed: " + char1 + " Unboxed: " + char2);

        // Integer
        Integer int1 = 99;
        int int2 = char1;
        System.out.println("Integer Boxed: " + int1 + " Unboxed: " + int2);

        // Byte
        Byte byte1 = 120;
        byte byte2 = byte1;
        System.out.println("Byte Boxed: " + byte1 + " Unboxed: " + byte2);

        // Short
        Short short1 = 32000;
        short short2 = short1;
        System.out.println("Short Boxed: " + short1 + " Unboxed: " + short2);

        // Long
        Long long1 = 123456789L;
        long long2 = long1;
        System.out.println("Long Boxed: " + long1 + " Unboxed: " + long2);

        // Float
        Float float1 = 23.45f;
        float float2 = float1;
        System.out.println("Float Example -> Boxed: " + float1 + ", Unboxed: " + float2);

	}

}
