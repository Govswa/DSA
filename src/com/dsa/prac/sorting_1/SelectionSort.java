package com.dsa.prac.sorting_1;


public class SelectionSort {

	public static void selectionSort(int[] a) {
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			int min_index = i;
			for (int j = i; j < n; j++) {
				if (a[j] < a[min_index]) {
					min_index = j;
				}
			}

			swap(i, min_index, a);
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
		int[] a = { 13, 46, 24, 52, 20, 9 };
		selectionSort(a);
		printArray(a);
	}
}
