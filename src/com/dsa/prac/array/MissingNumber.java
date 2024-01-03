package com.dsa.prac.array;

import java.util.HashMap;
import java.util.Map;

public class MissingNumber {

	public static int findMissingNumberBruteForce(int[] a, int n) {
		for (int i = 1; i <= n; i++) {
			int flag = 0;
			for (int j = 0; j < a.length; j++) {
				if (i == a[j]) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				return i;
			}
		}
		return -1;
	}

	public static int findMissingNumberUsingMap(int[] a, int n) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			map.put(a[i], map.getOrDefault(map.get(a[i]), 0) + 1);
		}

		for (int i = 1; i <= n; i++) {
			if (map.getOrDefault(i, 0) == 0) {
				return i;
			}
		}
		return -1;
	}
	
	public static int findMissingNumberUsingHashing(int[] a, int n) {
		int[] hash = new int[n + 1];
		for (int i = 0; i < a.length; i++) {
			hash[a[i]]++;
		}

		for (int i = 1; i <= n; i++) {
			if (hash[i] == 0) {
				return i;
			}
		}
		return -1;
	}
	
	public static int findMissingNumberOptimal_1(int[] a, int n) {
		int sumN = (n * (n + 1)) / 2;
		int sumA = 0;
		for(int i = 0; i < a.length; i++) {
			sumA += a[i];
		}
		
		if(sumN - sumA > 0) {
			return (sumN - sumA);
		}
		return -1;
	}
	
	public static int findMissingNumberOptimalBestUsingXOR(int[] a, int n) {
		int xor1 = 0;
		int xor2 = 0;
		
		if(a.length == n) {
			return -1;
		}
		
		for(int i = 0; i < a.length; i++) {
			xor1 = xor1 ^ a[i];
			xor2 = xor2 ^ (i + 1);
		}
		
		xor2 = xor2 ^ n;
		
		if((xor1 ^ xor2) > 0) {
			return (xor1 ^ xor2);
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] a1 = { 1, 2, 4, 5 };
		System.out.println(findMissingNumberBruteForce(a1, 5));
		int[] a2 = { 1, 3 };
		System.out.println(findMissingNumberBruteForce(a2, 3));

		int[] a3 = { 1, 2, 4, 5 };
		System.out.println(findMissingNumberUsingMap(a3, 5));
		int[] a4 = { 1, 3 };
		System.out.println(findMissingNumberUsingMap(a4, 3));
		
		int[] a5 = { 1, 2, 4, 5 };
		System.out.println(findMissingNumberUsingHashing(a5, 5));
		int[] a6 = { 1, 3 };
		System.out.println(findMissingNumberUsingHashing(a6, 3));
		
		int[] a7 = { 1, 2, 4, 5 };
		System.out.println(findMissingNumberOptimal_1(a7, 5));

		int[] a8 = { 1, 3 };
		System.out.println(findMissingNumberOptimal_1(a8, 3));
		
		int[] a9 = { 1, 2, 4, 5};
		System.out.println(findMissingNumberOptimalBestUsingXOR(a9, 5));

		int[] a11 = { 1, 3 };
		System.out.println(findMissingNumberOptimalBestUsingXOR(a11, 3));
	}
}
