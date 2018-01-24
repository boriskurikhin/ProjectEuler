import java.math.BigInteger;

public class p20 {
	
	public static void main(String[] args) {
		BigInteger fact = BigInteger.ONE;
		
		for (int i = 1; i <= 100; i++) 
			fact = fact.multiply(new BigInteger(String.valueOf(i)));
		
		int sum = 0;
		
		for (char c : fact.toString().toCharArray())
			sum += (c - '0');
		
		System.out.println(sum);

	}

}
