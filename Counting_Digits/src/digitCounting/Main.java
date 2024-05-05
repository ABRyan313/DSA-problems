package digitCounting;
import java.util.*;

public class Main {
	
	static long digitCount(long n) {
		int count = 0;
		while(n!=0) {
			n = n/10;
			count++;
		}
		return count;
		
	}

	public static void main(String[] args) {
		System.out.println("Enter your number");
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();
		digitCount(n);
		System.out.println("Number of digits: " +digitCount(n));

	}

}
