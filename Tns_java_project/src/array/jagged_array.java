package array;

public class jagged_array {

	public static void main(String[] args) {
		
		int[][] ar = {
	            {6, 2},        // row 1
	            {4, 5, 3, 7},  // row 2
	            {3, 9, 9}      // row 3
	        };

		
		
	        for (int[] row : ar) {
	        	
	            for (int val : row) {
	            	
	                System.out.print(val + " ");
	            }
	            System.out.println();
	        }
	}    
	
}