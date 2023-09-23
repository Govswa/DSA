package com.dsa.prac.number;

//euclidean algorithm - gcd(a, b) = gcd(a - b, b) ;a>b
//simpler gcd(a % b, b) a > b
public class GCDOptimalApproach {

	public static int gcd(int a, int b) {
		while (a > 0 && b > 0) {
			if (a > b)
				a = a % b;
			else
				b = b % a;
		}

		if (a == 0)
			return b;
		return a;
	}

	public static void main(String[] args) {
		System.out.println(gcd(4, 8));
	}
}
