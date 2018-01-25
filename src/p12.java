import java.util.HashMap;
import java.util.Map;

public class p12 {
	
	static HashMap<Long, Long> map = new HashMap<Long, Long>();

	public static void main(String[] args) {
		
		long k = 1 ;
		
		while(true) {
			
			getDivisorsAndBuild(k);
			k++;
		}
	}
	
	public static void getDivisorsAndBuild(long N) {
		long triNum = 0, nDivisors = 0;
		Map<Long, Long> m = new HashMap<Long, Long>();
		
		for (long i = 1; i <= N; i++)
			triNum += i;
		
		if (triNum % (2*3*5*7) != 0)
			return;
		
		for (long i = triNum; i >= 1; i--) {
			if (triNum % i == 0)
				m.put(i, i);
		}
		
		nDivisors = m.size();
		
		if (nDivisors > 300) System.out.println(triNum + " has " + nDivisors + " divisors.");
		 
		if (nDivisors > 500) {
			System.out.println("FOUND IT!");
			System.exit(0);
		}
	}
}
