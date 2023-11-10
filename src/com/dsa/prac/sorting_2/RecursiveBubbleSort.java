package com.dsa.prac.sorting_2;

public class RecursiveBubbleSort {

	public static void recursiveBubbleSort(int a[], int endIndex) {
		if (endIndex == 0) {
			return;
		}
		for (int i = 0; i < endIndex; i++) {
			if (a[i] > a[i + 1]) {
				swap(i, i + 1, a);
			}
		}
		recursiveBubbleSort(a, endIndex - 1);
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
		recursiveBubbleSort(a, a.length - 1);
		printArray(a);
	}
}
