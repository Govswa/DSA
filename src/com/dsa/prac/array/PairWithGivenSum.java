package com.dsa.prac.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PairWithGivenSum {

	public static int[] pairWithGivenSumBruteForce(int[] a, int k) {

		int[] pairSumA = { -1, 1 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == k) {
					pairSumA[0] = i;
					pairSumA[1] = j;
				}
			}
		}
		return pairSumA;
	}

	public static int[] pairWithGivenSumUsingHashing(int[] a, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			int rem = k - a[i];
			if (map.containsKey(rem)) {
				return new int[] { map.get(rem), i };
			} else {
				map.put(a[i], i);
			}
		}
		return new int[] { -1, -1 };
	}

	public static String pairWithGivenSumUsing2Pointer(int[] a, int k) {
		int left = 0, right = a.length - 1;
		Arrays.sort(a);
		while (left < right) {
			int sum = a[left] + a[right];
			if (sum == k) {
				return "Yes";
			} else if (sum < k) {
				left++;
			} else {
				right--;
			}
		}
		return "No";
	}

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] a1 = { 2, 6, 5, 8, 11 };
		printArray(pairWithGivenSumBruteForce(a1, 14));
		System.out.println();
		int[] a2 = { 2, 6, 5, 8, 11 };
		printArray(pairWithGivenSumBruteForce(a2, 15));
		System.out.println();

		int[] a3 = { 2, 6, 5, 8, 11 };
		printArray(pairWithGivenSumUsingHashing(a3, 14));
		System.out.println();
		int[] a4 = { 2, 6, 5, 8, 11 };
		printArray(pairWithGivenSumUsingHashing(a4, 15));
		System.out.println();

		int[] a5 = { 2, 6, 5, 8, 11 };
		System.out.println(pairWithGivenSumUsing2Pointer(a5, 14));
		int[] a6 = { 2, 6, 5, 8, 11 };
		System.out.println(pairWithGivenSumUsing2Pointer(a6, 15));
	}
}