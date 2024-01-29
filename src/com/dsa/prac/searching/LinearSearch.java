package com.dsa.prac.searching;

public class LinearSearch {

	public static int linearSearch(int[] a, int k) {
		for (int i = 0; i < a.length; i++) {
			if (k == a[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int key = 5;
		System.out.println(key + " at index: " + linearSearch(a, key));

		int[] a1 = { 5, 4, 3, 2, 1 };
		key = 3;
		System.out.println(key + " at index: " + linearSearch(a1, key));
	}
}
