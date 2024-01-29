package com.dsa.prac.array;

import java.util.function.Function;

public class KadanesAlgorithmMaximumSubarraySum {

	public static int kadanesAlgorithmMaximumSubarraySumBruteFroce(int[] a) {
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum += a[k];
				}
				if (maxSum <= sum) {
					maxSum = sum;
				}
			}
		}
		return maxSum;
	}

	public static int kadanesAlgorithmMaximumSubarraySumBetter(int[] a) {
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = i; j < a.length; j++) {
				sum += a[j];
				maxSum = Math.max(maxSum, sum);
			}
		}
		return maxSum;
	}

	public static int kadanesAlgorithmMaximumSubarraySumKadanesAgloOptimal(int[] a) {
		int maxSum = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			if (maxSum < sum) {
				maxSum = sum;
			}
			if (sum < 0) {
				sum = 0;
			}
		}
		// To consider the sum of the empty subarray or all will be negative
		// uncomment the following check:

		// if (maxi < 0) maxi = 0;
		return maxSum;
	}

	public static int[] kadanesAlgorithmMaximumSumSubarrayKadanesAgloOptimal(int[] a) {
		int maxSum = Integer.MIN_VALUE;
		int sum = 0;
		int tempStart = -1, start = -1, end = -1;
		for (int i = 0; i < a.length; i++) {
			if (sum == 0) {
				tempStart = i;
			}

			sum += a[i];
			if (maxSum < sum) {
				maxSum = sum;
				start = tempStart;
				end = i;
			}
			if (sum < 0) {
				sum = 0;
			}
		}
		if (maxSum < 0) {
			return new int[] {};
		}

		int[] sumA = new int[end - start + 1];
		for (int i = start, j = 0; i <= end; i++, j++) {
			sumA[j] = a[i];
		}
		return sumA;
	}

	public static void test(Function<int[], Integer> kadanesAlgorithmMaximumSubarraySumConsumer) {
		int[] a1 = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(kadanesAlgorithmMaximumSubarraySumConsumer.apply(a1));

		int[] a2 = { 1 };
		System.out.println(kadanesAlgorithmMaximumSubarraySumConsumer.apply(a2));

		int[] a3 = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println(kadanesAlgorithmMaximumSubarraySumConsumer.apply(a3));

		int[] a4 = { -2, -3, -1, -2, -3 };
		System.out.println(kadanesAlgorithmMaximumSubarraySumConsumer.apply(a4));
	}

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("kadanesAlgorithmMaximumSubarraySumBruteFroce");
		test(KadanesAlgorithmMaximumSubarraySum::kadanesAlgorithmMaximumSubarraySumBruteFroce);

		System.out.println("kadanesAlgorithmMaximumSubarraySumBetter");
		test(KadanesAlgorithmMaximumSubarraySum::kadanesAlgorithmMaximumSubarraySumBetter);

		System.out.println("kadanesAlgorithmMaximumSubarraySumOptimal");
		test(KadanesAlgorithmMaximumSubarraySum::kadanesAlgorithmMaximumSubarraySumKadanesAgloOptimal);

		System.out.println("kadanesAlgorithmMaximumSumSubarrayKadanesAgloOptimal");
		int[] a1 = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		a1 = kadanesAlgorithmMaximumSumSubarrayKadanesAgloOptimal(a1);
		printArray(a1);

		int[] a2 = { 1 };
		a2 = kadanesAlgorithmMaximumSumSubarrayKadanesAgloOptimal(a2);
		printArray(a2);

		int[] a3 = { -2, -3, 4, -1, -2, 1, 5, -3 };
		a3 = kadanesAlgorithmMaximumSumSubarrayKadanesAgloOptimal(a3);
		printArray(a3);

		int[] a4 = { -2, -3, -1, -2, -3 };
		a4 = kadanesAlgorithmMaximumSumSubarrayKadanesAgloOptimal(a4);
		printArray(a4);
	}
}
