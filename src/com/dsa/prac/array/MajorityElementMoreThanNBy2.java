package com.dsa.prac.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;

public class MajorityElementMoreThanNBy2 {

	public static int majorityElementMoreThanNBy2BruteFroce(int[] a) {
		int c = 0, n = a.length;
		for (int i = 0; i < n; i++) {
			c = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					c++;
				}
			}
			if (c > (n / 2)) {
				return a[i];
			}
		}
		return -1;
	}

	public static int majorityElementMoreThanNBy2UsingMapBetter(int[] a) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int x : a) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}

		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > (a.length / 2)) {
				return entry.getKey();
			}
		}
		return -1;
	}

	public static int majorityElementMoreThanNBy2MooresVotingAlgoOptimal(int[] a) {
		int c = 0, el = -1;
		for (int i = 0; i < a.length; i++) {
			if (c == 0) {
				el = a[i];
			}
			if (a[i] == el) {
				c++;
			} else {
				c--;
			}
		}

		c = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == el) {
				c++;
			}
		}

		if (c > (a.length / 2)) {
			return el;
		}
		return -1;
	}

	public static void test(Function<int[], Integer> majorityElementMoreThanNBy2Function) {

		int[] a1 = { 3, 2, 3 };
		System.out.println(majorityElementMoreThanNBy2Function.apply(a1));

		int[] a2 = { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println(majorityElementMoreThanNBy2Function.apply(a2));

		int[] a3 = { 4, 4, 2, 4, 3, 4, 4, 3, 2, 4 };
		System.out.println(majorityElementMoreThanNBy2Function.apply(a3));

		int[] a4 = { 7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5 };
		System.out.println(majorityElementMoreThanNBy2Function.apply(a4));

		int[] a5 = { 7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 1, 1, 1, 1, 1 };
		System.out.println(majorityElementMoreThanNBy2Function.apply(a5));
	}

	public static void main(String[] args) {
		System.out.println("majorityElementMoreThanNBy2BruteFroce");
		test(MajorityElementMoreThanNBy2::majorityElementMoreThanNBy2BruteFroce);

		System.out.println("majorityElementMoreThanNBy2UsingMapBetter");
		test(MajorityElementMoreThanNBy2::majorityElementMoreThanNBy2UsingMapBetter);

		System.out.println("majorityElementMoreThanNBy2MooresVotingAlgoOptimal");
		test(MajorityElementMoreThanNBy2::majorityElementMoreThanNBy2MooresVotingAlgoOptimal);

	}
}
