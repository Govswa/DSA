package com.dsa.prac.array;

public class MaximumConsecutiveOne {

	public static int maximumConsecutiveOne(int[] a) {
		int tc = 0, mc = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1) {
				tc++;
			}else {
				tc = 0;
			}

			if (mc < tc) {
				mc = tc;
			}
		}
		return mc;
	}

	public static void main(String[] args) {
		int[] a = { 1, 1, 1, 1, 0, 1, 1, 1 };
		System.out.println(maximumConsecutiveOne(a));
	}
}
