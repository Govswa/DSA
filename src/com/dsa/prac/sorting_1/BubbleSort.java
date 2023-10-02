package com.dsa.prac.sorting_1;

public class BubbleSort {

	// worst case - O(n^2)
	public static void bubbleSort(int[] a) {
		int n = a.length;
		for (int i = n - 2; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				if (a[j] > a[j + 1]) {
					swap(j, j + 1, a);
				}
			}
		}
	}

	// if array is already sorted then it will take O(n) time complexity
	public static void bubbleSortOptimazed(int[] a) {
		int n = a.length;
		for (int i = n - 2; i >= 0; i--) {
			int isSwaped = 0;
			for (int j = 0; j <= i; j++) {
				if (a[j] > a[j + 1]) {
					swap(j, j + 1, a);
					isSwaped = 1;
				}
			}
			if (isSwaped == 0) {
				break;
			}
			System.out.println("run");
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
		bubbleSort(a);
		printArray(a);

		System.out.println();
		int[] aSorted = { 1, 2, 3, 4, 5, 6 };
		bubbleSortOptimazed(aSorted);
		printArray(aSorted);
	}
}
