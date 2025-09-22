package tns_package;

public class Prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Prime numbers from 1 to 100:");

        for (int n = 2; n <= 100; n++) {
            boolean isPrime = true;

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(n);
            }
        }

	}

}
