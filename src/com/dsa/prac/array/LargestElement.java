package com.dsa.prac.array;

public class LargestElement {

	public static int largestElement(int[] a) {
		int largestElement = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > largestElement) {
				largestElement = a[i];
			}
		}
		return largestElement;
	}

	public static void main(String[] args) {
		int[] a = { 2, 5, 1, 3, 0, 5, 8 };
		System.out.println(largestElement(a));
	}
}
