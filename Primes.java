public class Primes {
	public static void main(String[] args) {
		for (int i = 2; i <= 100; i++) {
			if (isPrime(i)) {
				System.out.print(i+" ");
			}
		}

	}
	
	public static boolean isPrime(int n) {
			boolean check = true;
			for (int j = 2; j < n; j++) {
				if ((n % j) == 0) {
					check = false;
					break;
				}
			}
			return check;
	}
}