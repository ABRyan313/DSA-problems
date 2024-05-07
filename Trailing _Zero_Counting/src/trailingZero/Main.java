package trailingZero;
import java.util.*;
public class Main {
	
	static long trailingZero(long n) {
		
		long res = 0;
		int powOf = 5;
		while(n >= powOf) {
		res	= res + (n/powOf); 
		powOf = powOf * 5;
		}
		return res;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your number");
		long n = sc.nextLong();
		sc.close();
		System.out.println("trailing zero of the given numbers's factorial is: " + trailingZero(n));

	}

}
