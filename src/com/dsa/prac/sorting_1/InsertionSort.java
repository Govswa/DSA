package com.dsa.prac.sorting_1;

public class InsertionSort {
	// worst & avg case time complexity is O(n^2)
	public static void insertionSort(int[] a) {
		int n = a.length;
		for (int i = 1; i < n; i++) {
			int j = i;
			while (j > 0 && a[j] < a[j - 1]) {
				swap(j, j - 1, a);
				j--;
			}
		}
	}

	public static void swap(int i, int j, int[] a) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		/*
		 * int[] a = { 14, 9, 15, 12, 6, 8, 13 }; insertionSort(a); printArray(a);
		 */

		// already sorted array then time complexity will be O(n)
		int[] aSorted = { 1, 2, 3, 4, 5 };
		insertionSort(aSorted);
		printArray(aSorted);
	}
}
