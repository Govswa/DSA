package com.dsa.prac.number;

import java.util.Set;
import java.util.TreeSet;

public class PrimeNumber {

	public static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPrimeOptimal(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static Set<Integer> primeNumberBeforeN(int n) {
		Set<Integer> primeNumbers = new TreeSet<>();

		for (int i = 2; i <= 100; i++) {
			if (isPrime(i)) {
				primeNumbers.add(i);
			}
		}
		return primeNumbers;
	}

	public static void main(String[] args) {
		System.out.println(isPrime(197));

		System.out.println(isPrimeOptimal(29));

		Set<Integer> primeNumberBeforeN = primeNumberBeforeN(10);
		primeNumberBeforeN.forEach(n -> System.out.print(n + " "));
	}
}
