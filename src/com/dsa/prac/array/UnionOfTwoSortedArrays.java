package com.dsa.prac.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UnionOfTwoSortedArrays {

	public static ArrayList<Integer> unionOfTwoSortedArraysUsingMap(int[] a1, int[] a2) {
		Map<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> union = new ArrayList<>();

		for (int i = 0; i < a1.length; i++) {
			map.put(a1[i], map.getOrDefault(a1[i], 0) + 1);
		}

		for (int i = 0; i < a2.length; i++) {
			map.put(a2[i], map.getOrDefault(a2[i], 0) + 1);
		}

		map.forEach((k, v) -> union.add(k));
		return union;
	}

	public static Set<Integer> unionOfTwoSortedArraysUsingSet(int[] a1, int[] a2) {
		Set<Integer> union = new HashSet<>();

		for (int i = 0; i < a1.length; i++) {
			union.add(a1[i]);
		}

		for (int i = 0; i < a2.length; i++) {
			union.add(a2[i]);
		}

		return union;
	}

	public static ArrayList<Integer> unionOfTwoSortedArrays(int[] a1, int[] a2) {
		ArrayList<Integer> union = new ArrayList<>();

		int i = 0, j = 0;
		while (i < a1.length && j < a2.length) {
			if (a1[i] <= a2[j]) {
				if (union.size() == 0 || union.get(union.size() - 1) != a1[i]) {
					union.add(a1[i]);
				}
				i++;
			} else {
				if (union.size() == 0 || union.get(union.size() - 1) != a2[j]) {
					union.add(a2[j]);
				}
				j++;
			}
		}

		while (i < a1.length) {
			if (union.get(union.size() - 1) != a1[i]) {
				union.add(a1[i]);
			}
			i++;
		}

		while (j < a2.length) {
			if (union.get(union.size() - 1) != a2[j]) {
				union.add(a2[j]);
			}
			j++;
		}
		
		return union;
	}

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4, 5 };
		int[] a2 = { 2, 3, 4, 4, 5 };
		ArrayList<Integer> unionOfTwoSortedArraysUsingMap = unionOfTwoSortedArraysUsingMap(a1, a2);
		unionOfTwoSortedArraysUsingMap.forEach(x -> System.out.print(x + " "));
		System.out.println();

		Set<Integer> unionOfTwoSortedArraysUsingSet = unionOfTwoSortedArraysUsingSet(a1, a2);
		unionOfTwoSortedArraysUsingSet.forEach(x -> System.out.print(x + " "));
		System.out.println();

		ArrayList<Integer> unionOfTwoSortedArrays = unionOfTwoSortedArrays(a1, a2);
		unionOfTwoSortedArrays.forEach(x -> System.out.print(x + " "));
	}
}
