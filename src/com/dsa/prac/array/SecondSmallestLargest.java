package com.dsa.prac.array;

public class SecondSmallestLargest {
	public static int[] secondSmallestLargest(int n, int[] a) {
		if (n < 2) {
			return new int[] { -1, -1 };
		}

		int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
		int secondSamllest = Integer.MAX_VALUE, smallest = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			if (a[i] > largest) {
				secondLargest = largest;
				largest = a[i];
			} else if (a[i] > secondLargest && a[i] != largest) {
				secondLargest = a[i];
			}

			if (a[i] < smallest) {
				secondSamllest = smallest;
				smallest = a[i];
			} else if (a[i] < secondSamllest && a[i] != smallest) {
				secondSamllest = a[i];
			}
		}

		return new int[] { secondLargest, secondSamllest };
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 7, 7, 5 };

		int[] secondSmallestLargest = secondSmallestLargest(a.length, a);

		System.out.println(
				"secondLargest: " + secondSmallestLargest[0] + ", secondSamllest: " + secondSmallestLargest[1]);
	}
}
