package com.dsa.prac.array;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarraySumK {

	public static int longestSubarraySumKBruteForce(int[] a, int k) {

		int len = 0;
		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = i; j < a.length; j++) {
				sum += a[j];
				if (sum == k) {
					len = Math.max(len, j - i + 1);
					break;
				} else if (sum > k) {
					break;
				}
			}
		}
		return len;
	}

	public static int longestSubarraySumKUsingHashing(int[] a, int k) {
		int sum = 0;
		int maxLen = 0;
		Map<Integer, Integer> preSumMap = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			sum += a[i];

			if (sum == k) {
				maxLen = Math.max(maxLen, i + 1);
			}

			int rem = sum - k;

			if (preSumMap.containsKey(rem)) {
				int len = i - preSumMap.get(rem);
				maxLen = Math.max(maxLen, len);
			}

			if (!preSumMap.containsKey(sum)) {
				preSumMap.put(sum, i);
			}

		}
		return maxLen;
	}

	public static int longestSubarraySumKUsing2Pointer(int[] a, int k) {
		int left = 0, right = 0;
		int sum = a[0];
		int maxLen = 0;
		while (right < a.length) {
			while (left <= right && sum > k) {
				sum -= a[left];
				left++;
			}
			if (sum == k) {
				maxLen = Math.max(maxLen, right - left + 1);
			}
			right++;
			if(right < a.length) sum+= a[right];
		}
		return maxLen;
	}

	public static void longestSubarraySumKTest() {
		int[] a1 = { 2, 3, 6, 1, 9, 2, 4, 3, 1 };
		System.out.println(longestSubarraySumKBruteForce(a1, 10));

		int[] a2 = { 2, 3, 5 };
		System.out.println(longestSubarraySumKBruteForce(a2, 5));

		int[] a3 = { 2, 3, 5, 1, 9 };
		System.out.println(longestSubarraySumKBruteForce(a3, 10));

		int[] a4 = { 4, 4, 5, 6, 7, 8 };
		System.out.println(longestSubarraySumKBruteForce(a4, 10));

		int[] a5 = { 10 };
		System.out.println(longestSubarraySumKBruteForce(a5, 10));
	}

	public static void longestSubarraySumKUsingHashingTest() {
		int[] a1 = { 2, 3, 6, 1, 9, 2, 4, 3, 1 };
		System.out.println(longestSubarraySumKUsingHashing(a1, 10));

		int[] a2 = { 2, 3, 5 };
		System.out.println(longestSubarraySumKUsingHashing(a2, 5));

		int[] a3 = { 2, 3, 5, 1, 9 };
		System.out.println(longestSubarraySumKUsingHashing(a3, 10));

		int[] a4 = { 4, 4, 5, 6, 7, 8 };
		System.out.println(longestSubarraySumKUsingHashing(a4, 10));

		int[] a5 = { 10 };
		System.out.println(longestSubarraySumKUsingHashing(a5, 10));

		int[] a6 = { 1, 2, 3, 1, 1, 1, 1, 4, 2, 3 };
		System.out.println(longestSubarraySumKUsingHashing(a6, 3));
	}

	public static void longestSubarraySumKUsing2PointerTest() {
		int[] a1 = { 2, 3, 6, 1, 9, 2, 4, 3, 1 };
		System.out.println(longestSubarraySumKUsing2Pointer(a1, 10));

		int[] a2 = { 2, 3, 5 };
		System.out.println(longestSubarraySumKUsing2Pointer(a2, 5));

		int[] a3 = { 2, 3, 5, 1, 9 };
		System.out.println(longestSubarraySumKUsing2Pointer(a3, 10));

		int[] a4 = { 4, 4, 5, 6, 7, 8 };
		System.out.println(longestSubarraySumKUsing2Pointer(a4, 10));

		int[] a5 = { 10 };
		System.out.println(longestSubarraySumKUsing2Pointer(a5, 10));

		int[] a6 = { 1, 2, 3, 1, 1, 1, 1, 4, 2, 3 };
		System.out.println(longestSubarraySumKUsing2Pointer(a6, 3));
		
		int[] a7 = { 1, 2, 3, 1, 1, 1, 1, 3, 3 };
		System.out.println(longestSubarraySumKUsing2Pointer(a7, 3));
	}

	public static void main(String[] args) {
		longestSubarraySumKTest();
		System.out.println("\n");
		longestSubarraySumKUsingHashingTest();
		System.out.println("\n");
		longestSubarraySumKUsing2PointerTest();
	}
}