package tns_package;

public class Armstron {

	public static void main(String[] args) {
		 
		System.out.println("Armstrong numbers from 1 to 100");
		
		 for (int num = 1; num <= 1000; num++) {
	            
			 int ogNum = num;
	            int sum = 0;
	            int noDigits = String.valueOf(num).length();  // number of digits
	            
	            while (num > 0) {
	                int digit = num % 10;
	                sum += Math.pow(digit, noDigits); // raise digit to the power of digits
	                num /= 10;
	            }
	           
	            if (sum == ogNum) {
	                System.out.println(ogNum);
	            }
	            
	            num = ogNum; // reset num for next iteration
	}

}
