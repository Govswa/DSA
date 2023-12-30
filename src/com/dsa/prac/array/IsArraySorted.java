package com.dsa.prac.array;

public class IsArraySorted {

	public static int isSorted(int n, int[] a) {
		for (int i = 1; i < n; i++) {
			if (a[i] < a[i - 1]) {
				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 3, 4, 5, 6, 6 };
		System.out.println(isSorted(a.length, a));

		int[] a1 = { 1, 2, 3, 4, 5, 6 };
		System.out.println(isSorted(a1.length, a1));

		int[] a2 = { 1, 2, 3, 7, 5, 6 };
		System.out.println(isSorted(a2.length, a2));
	}
}
