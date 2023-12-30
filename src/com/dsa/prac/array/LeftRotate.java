package com.dsa.prac.array;

public class LeftRotate {

	public static void leftRotate(int[] a) {
		int firstElement = a[0];
		int i = 0;
		while (i < a.length - 1) {
			a[i] = a[i + 1];
			i++;
		}
		a[a.length - 1] = firstElement;
	}

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		leftRotate(a);
		printArray(a);

		System.out.println();
		int[] a1 = { 3 };
		leftRotate(a1);
		printArray(a1);
	}
}
