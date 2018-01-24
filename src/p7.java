
public class p7 {
	
	public static boolean isPrime(int number) {
		if (number < 2)
			return false;
		for (int i = 2; i < (int)Math.sqrt(number) + 1; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int N = 10001;
		int prime = 1;
		int n = 0;
		
		while (n < N) {
			prime++;
			if (isPrime(prime)) {
				n++;
			}
		}
		System.out.println(prime);
	}

}
