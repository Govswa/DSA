package com.dsa.prac.array;

import java.util.HashMap;
import java.util.Map;

public class NumberAppearsncOnceeOtherTwice {

	public static int numberAppearsncOnceeOtherTwiceUsingMap(int[] a) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			map.put(a[i], map.getOrDefault(a[i], 0) + 1);
		}

		for (int i = 0; i < a.length; i++) {
			if (map.get(a[i]) == 1) {
				return a[i];
			}
		}
		return -1;
	}

	public static int numberAppearsncOnceeOtherTwiceUsingXOR(int[] a) {
		int xor = 0;
		for (int i = 0; i < a.length; i++) {
			xor = xor ^ a[i];
		}
		return xor;
	}

	public static void main(String[] args) {
		int[] a1 = { 2, 2, 1 };
		System.out.println(numberAppearsncOnceeOtherTwiceUsingMap(a1));

		int[] a2 = { 4, 1, 2, 1, 2 };
		System.out.println(numberAppearsncOnceeOtherTwiceUsingMap(a2));
		
		int[] a3 = { 2, 2, 1 };
		System.out.println(numberAppearsncOnceeOtherTwiceUsingXOR(a3));

		int[] a4 = { 4, 1, 2, 1, 2};
		System.out.println(numberAppearsncOnceeOtherTwiceUsingXOR(a4));
	}
}
