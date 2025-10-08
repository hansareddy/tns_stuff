package Strings;

public class String_normal {
	    public static void main(String[] args) {
	    	
	        // Creating strings
	        String str = "Hello";
	        String str2 = new String("worldu");
	        
	        // methods
	        System.out.println("Length: " + str.length());
	        System.out.println("Char at 0: " + str.charAt(0));
	        System.out.println("Uppercase: " + str.toUpperCase());
	        System.out.println("Lowercase: " + str.toLowerCase());
	        System.out.println("Contains 'll': " + str.contains("ll"));
	        System.out.println("Replace 'l' with 'r': " + str.replace('l', 'r'));
	        System.out.println("Concat: " + str.concat(" World"));
	        System.out.println("Trim spaces: '" + str2.trim() + "'");
	        System.out.println("Equals: " + str.equals("Hello"));
	     
	        String text = "Java is fun";
	        String[] words = text.split(" ");
	        
	        for (String word : words) {
	            System.out.println(word);
	        }
	    }
}

