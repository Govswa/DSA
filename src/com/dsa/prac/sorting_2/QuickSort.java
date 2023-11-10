package com.dsa.prac.sorting_2;

public class QuickSort {
	// divide and conquer algorithm
	public static void quickSort(int[] a, int low, int high) {
		if (low < high) {
			int partitionIndex = partition(a, low, high);
			quickSort(a, low, partitionIndex - 1);
			quickSort(a, partitionIndex + 1, high);
		}
	}

	private static int partition(int[] a, int low, int high) {
		int pivot = a[low];
		int i = low + 1;
		int j = high;

		while (i < j) {
			while (a[i] >= pivot && i <= high - 1) i++;
			while (a[j] < pivot && j >= low + 1) j--;
			
			//descending order
			//while (a[i] <= pivot && i <= high - 1) i++;
			//while (a[j] > pivot && j >= low + 1) j--;
			
			if (i < j) swap(i, j, a);
		}

		swap(j, low, a);
		return j;
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
		int a[] = { 4, 6, 2, 5, 7, 9, 1, 3 };
		quickSort(a, 0, a.length - 1);
		printArray(a);
	}
}
