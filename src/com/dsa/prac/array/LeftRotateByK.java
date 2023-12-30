package com.dsa.prac.array;

public class LeftRotateByK {

	public static void leftRotate(int[] a, int k) {
		if (a.length < k) {
			throw new RuntimeException("number of element is less than number of rotation");
		} else {
			int[] tempA = new int[k];
			for (int i = 0; i < k; i++) {
				tempA[i] = a[i];
			}

			int i = k;
			while (i < a.length) {
				a[i - k] = a[i++];
			}

			for (int t = a.length - k, j = 0; t < a.length; t++, j++) {
				a[t] = tempA[j];
			}
		}
	}


	public static void leftRotate_2(int[] a, int k) {
		int l = a.length;
		reverseArray(a, 0, k - 1);
		reverseArray(a, k, l - 1);
		reverseArray(a, 0, l - 1);
	}

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void leftRotationTest(int rotationMethod) {
		int[] a1 = { 1, 2, 3, 4, 5, 6, 7 };
		int[] a2 = { 3, 7, 8, 9, 10, 11 };
		int[] a3 = { 3 };
		if (rotationMethod == 1) {
			leftRotate(a1, 2);
			printArray(a1);

			System.out.println();

			leftRotate(a2, 3);
			printArray(a2);

			System.out.println();

			leftRotate(a3, 2);
			printArray(a3);
		} else {
			leftRotate_2(a1, 2);
			printArray(a1);

			System.out.println();

			leftRotate_2(a2, 3);
			printArray(a2);

			System.out.println();

			leftRotate_2(a3, 2);
			printArray(a3);
		}
	}

	public static void reverseArray(int a[], int k, int l) {
		int i = k, j = l;
		while (i <= j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
	}

	public static void main(String[] args) {
		leftRotationTest(2);
	}
}
