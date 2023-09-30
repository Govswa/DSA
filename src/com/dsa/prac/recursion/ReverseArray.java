package com.dsa.prac.recursion;

public class ReverseArray {

	public int[] reverseArray_1(int[] a) {
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[a.length - 1 - i];
		}
		return b;
	}

	public int[] reverseArraySpaceOptimzed(int[] a) {
		int p = 0;
		int q = a.length - 1;
		while (p < q) {
			int t = a[p];
			a[p] = a[q];
			a[q] = t;
			p++;
			q--;
		}
		return a;
	}

	public int[] reverseArraySpaceOptimzed_2(int[] a) {
		int t = 0;
		for (int i = 0; i < a.length / 2; i++) {
			t = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = t;
		}
		return a;
	}

	public void reverseArrayRecursive(int[] a, int start, int end) {
		if (start < end) {
			int t = a[start];
			a[start] = a[end];
			a[end] = t;
			reverseArrayRecursive(a, start + 1, end - 1);
		}
	}

	public void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ReverseArray r = new ReverseArray();

		int[] reverseArray_1 = r.reverseArray_1(new int[] { 1, 2, 3, 4, 5 });
		r.printArray(reverseArray_1);

		int[] reverseArraySpaceOptimzed = r.reverseArraySpaceOptimzed(new int[] { 1, 2, 3, 4, 5 });
		r.printArray(reverseArraySpaceOptimzed);

		int[] reverseArraySpaceOptimzed_2 = r.reverseArraySpaceOptimzed_2(new int[] { 1, 2, 3, 4, 5 });
		r.printArray(reverseArraySpaceOptimzed_2);

		int[] a = new int[] { 1, 2, 3, 4, 5 };
		r.reverseArrayRecursive(a, 0, 4);
		r.printArray(a);
	}
}
