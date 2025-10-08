package Strings;

public class String_buffer {
	
    public static void main(String[] args) {
    	
        StringBuffer sb = new StringBuffer("Hello");
        
        //  methods
        
        System.out.println("Length: " + sb.length());
        
        // Append
        sb.append(" World");
        System.out.println("append: " + sb);
       
        // Delete
        sb.delete(5, 15);
        System.out.println("After delete: " + sb);
        
        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);
        
        // charAt 
        System.out.println("Char at 0: " + sb.charAt(0));
        

        // Substring
        System.out.println("Substring from 2: " + sb.substring(2));
    }
}