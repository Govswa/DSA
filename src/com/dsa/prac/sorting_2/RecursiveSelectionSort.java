package com.dsa.prac.sorting_2;

public class RecursiveSelectionSort {

	public static void recursiveSelectionSort(int a[], int begingIndex, int n) {
		if (begingIndex >= n - 1) {
			return;
		}

		int minIndex = begingIndex;
		for (int i = begingIndex + 1; i < n; i++) {
			if (a[i] < a[minIndex]) {
				minIndex = i;
			}
		}

		swap(begingIndex, minIndex, a);
		recursiveSelectionSort(a, begingIndex + 1, n);
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
		int[] a = { 8, 2, 9, 4, 1 };
		recursiveSelectionSort(a, 0, a.length);
		printArray(a);
	}
}
