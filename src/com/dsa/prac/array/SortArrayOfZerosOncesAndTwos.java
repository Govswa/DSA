package com.dsa.prac.array;

import java.util.function.Consumer;

public class SortArrayOfZerosOncesAndTwos {

	public static void sortArrayOfZerosOncesAndTwosBruteFroce(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}

	public static void sortArrayOfZerosOncesAndTwosBetter(int[] a) {
		int counter0 = 0, counter1 = 0;
		for (int x : a) {
			if (x == 0)
				counter0++;
			if (x == 1)
				counter1++;
		}

		for (int i = 0; i < counter0; i++)
			a[i] = 0;
		for (int i = counter0; i < counter0 + counter1; i++)
			a[i] = 1;
		for (int i = counter0 + counter1; i < a.length; i++)
			a[i] = 2;
	}

	// Dutch National Flag Algorithm
	public static void sortArrayOfZerosOncesAndTwosOptimal(int[] a) {
		int low = 0, mid = 0, high = a.length - 1;
		while (low <= high) {
			if (a[mid] == 0) {
				swap(a, low, mid);
				low++;
				mid++;
			} else if (a[mid] == 1) {
				mid++;
			} else {
				swap(a, mid, high);
				high--;
			}
		}
	}

	public static void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void test(Consumer<int[]> sortArrayOfZerosOncesAndTwosConsumer) {
		int[] a1 = { 2, 0, 2, 1, 1, 0 };
		sortArrayOfZerosOncesAndTwosConsumer.accept(a1);
		printArray(a1);
		System.out.println();

		int[] a2 = { 2, 0, 1 };
		sortArrayOfZerosOncesAndTwosConsumer.accept(a2);
		printArray(a2);
		System.out.println();
	}

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		test(SortArrayOfZerosOncesAndTwos::sortArrayOfZerosOncesAndTwosBruteFroce);
		test(SortArrayOfZerosOncesAndTwos::sortArrayOfZerosOncesAndTwosBetter);
		test(SortArrayOfZerosOncesAndTwos::sortArrayOfZerosOncesAndTwosOptimal);
	}
}
