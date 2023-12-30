package com.dsa.prac.array;

//need to implement
public class RightRotateByK2 {

	public static void rightRotate(int[] a, int k) {
		if (a.length < k) {
			throw new RuntimeException("number of element is less than number of rotation");
		} else {
			int[] tempA = new int[k];
			int i = a.length - k, j = 0;
			while (i < a.length) {
				tempA[j++] = a[i++];
			}

			i = a.length - k - 1;
			while (i >= 0) {
				a[i + k] = a[i];
				i--;
			}

			for (int t = 0; t < k; t++) {
				a[t] = tempA[t];
			}
		}
	}


	public static void rightRotate_3(int[] a, int k) {
		int l = a.length;
		reverseArray(a, l - k, l - 1);
		reverseArray(a, 0, l - k - 1);
		reverseArray(a, 0, l - 1);
	}

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void rightRotationTest(int rotationMethod) {
		int[] a1 = { 1, 2, 3, 4, 5, 6, 7 };
		int[] a2 = { 3, 7, 8, 9, 10, 11 };
		int[] a3 = { 3 };
		if (rotationMethod == 1) {
			rightRotate(a1, 4);
			printArray(a1);

			System.out.println();

			rightRotate(a2, 3);
			printArray(a2);

			System.out.println();

			rightRotate(a3, 2);
			printArray(a3);

		} else {
			rightRotate_3(a1, 2);
			printArray(a1);

			System.out.println();

			rightRotate_3(a2, 3);
			printArray(a2);

			System.out.println();

			rightRotate_3(a3, 2);
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
		rightRotationTest(2);
	}

}
