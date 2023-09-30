package com.dsa.prac.recursion;

public class Factorial {

	public int fact(int n) {
		if (n == 0) {
			return 1;
		}
		return n * fact(n - 1);
	}
	
	//fact(n) = n * fact(n - 1)
	public int fact_1(int n) {
		int fact = 1;
		for(int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Factorial f = new Factorial();
		
		System.out.println(f.fact(5));
		
		System.out.println(f.fact_1(5));
	}
}
