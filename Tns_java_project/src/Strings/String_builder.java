package Strings;

public class String_builder{
	
    public static void main(String[] args) {
        // Create StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        
        // Length
        System.out.println("Original: " + sb);
        System.out.println("Length: " + sb.length());
        
        // Append
        sb.append(" World");
        System.out.println("After append: " + sb);
        
        // charAt
        System.out.println("Char at index 0: " + sb.charAt(0));
        System.out.println("Char at index 6: " + sb.charAt(6));
        
        // Delete
        sb.delete(5, 11);  // delete " World"
        System.out.println("After delete: " + sb);
        
        // Length
        System.out.println("New length: " + sb.length());
        
        // Substring
        System.out.println("Substring from 6: " + sb.substring(6));
        System.out.println("Substring 0 to 5: " + sb.substring(0, 5));
        
        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);
        
    }
}