package com.dsa.prac.array;

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

	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 5 };
		System.out.println(findMissingNumberBruteForce(a, 5));

		int[] a2 = { 1, 3 };
		System.out.println(findMissingNumberBruteForce(a2, 3));
	}
}
