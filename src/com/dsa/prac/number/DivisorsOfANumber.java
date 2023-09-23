package com.dsa.prac.number;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class DivisorsOfANumber {

	public static List<Integer> divisorsOfANumber(int n) {
		int[] divisors = new int[n / 2];
		int i = 0;
		for (int d = 1; d <= n / 2; d++) {
			if (n % d == 0)
				divisors[i++] = d;
		}
		divisors[i] = n;
		
		return IntStream.range(0, divisors.length)
						.mapToObj(index -> divisors[index])
						.filter(divisor -> divisor > 0)
						.collect(toList());
	}
	
	public static Set<Integer> divisorsOfANumberOptimal(int n) {
		Set<Integer> divisors = new TreeSet<>(); 
		for(int i = 1; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				divisors.add(i);
				if(n % i != i) {
					divisors.add(n / i);
				}
			}
		}
		return divisors;
	}

	public static void main(String[] args) {
		List<Integer> divisors = divisorsOfANumber(40);
		divisors.stream()
				.forEach(divisor -> System.out.print(divisor + " "));
		
		System.out.println();
		
		Set<Integer> divisorsOfANumberOptimal = divisorsOfANumberOptimal(40);
		divisorsOfANumberOptimal.forEach(divisor -> System.out.print(divisor + " "));
	}
}
