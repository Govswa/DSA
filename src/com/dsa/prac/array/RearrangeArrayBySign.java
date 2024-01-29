package com.dsa.prac.array;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class RearrangeArrayBySign {

	// positive and negative are occurs equal number of times
	public static int[] rearrangeArrayBySignBruteFroce(int[] a) {
		List<Integer> positiveList = new ArrayList<>();
		List<Integer> negativeList = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 0) {
				positiveList.add(a[i]);
			} else {
				negativeList.add(a[i]);
			}
		}
		return a;
	}

	// positive and negative are occurs equal number of times
	public static int[] rearrangeArrayBySignBetter(int[] a) {
		int ansA[] = new int[a.length];
		int pos = 0, neg = 1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 0) {
				ansA[pos] = a[i];
				pos += 2;
			}
			if (a[i] < 0) {
				ansA[neg] = a[i];
				neg += 2;
			}
		}
		return ansA;
	}

	// positive and negative are occurs unequal number of times
	public static int[] rearrangeArrayBySignUneqalBruteFroce(int[] a) {
		List<Integer> positiveList = new ArrayList<>();
		List<Integer> negativeList = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 0) {
				positiveList.add(a[i]);
			} else {
				negativeList.add(a[i]);
			}
		}

		int posL = positiveList.size();
		int negL = negativeList.size();
		if (posL > negL) {
			rerrangeBySign(a, positiveList, negativeList, negL);
			addRemaining(a, positiveList, 2 * posL, negL);
		} else {
			rerrangeBySign(a, positiveList, negativeList, posL);
			addRemaining(a, negativeList, 2 * negL, posL);
		}
		return a;
	}

	private static void addRemaining(int[] a, List<Integer> list, int next, int remEl) {
		for (int i = next, j = remEl; i < a.length; i++) {
			a[next] = list.get(j++);
		}
	}

	private static void rerrangeBySign(int[] a, List<Integer> positiveList, List<Integer> negativeList, int len) {
		for (int i = 0, j = 0, k = 0; i < len; i++) {
			a[2 * i] = positiveList.get(j++);
			a[2 * i + 1] = negativeList.get(k++);
		}
	}

	public static void test(Function<int[], int[]> rearrangeArrayBySigFunction) {
		int[] a1 = { 1, 2, -4, -5 };
		a1 = rearrangeArrayBySigFunction.apply(a1);
		printArray(a1);

		int[] a2 = { 1, 2, -3, -1, -2, 3 };
		a2 = rearrangeArrayBySigFunction.apply(a2);
		printArray(a2);
	}

	public static void testUneqal() {
		int[] a4 = { -1, 2, 3, -4, -3, -1 };
		rearrangeArrayBySignUneqalBruteFroce(a4);
		printArray(a4);

		int[] a1 = { 1, 2, -4, -5, 3, 4, 6 };
		rearrangeArrayBySignUneqalBruteFroce(a1);
		printArray(a1);
	}

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("rearrangeArrayBySignBruteFroce->");
		test(RearrangeArrayBySign::rearrangeArrayBySignBruteFroce);

		System.out.println("rearrangeArrayBySignBetter->");
		test(RearrangeArrayBySign::rearrangeArrayBySignBetter);

		System.out.println("rearrangeArrayBySignBetter->");
		testUneqal();
	}

}
