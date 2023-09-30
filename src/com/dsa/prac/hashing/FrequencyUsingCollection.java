package com.dsa.prac.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//in case of collision inserting or fetching will take o(n) in worst case otherwise it takes o(1)
public class FrequencyUsingCollection {

	public static int frequency(int k, int[] a) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < a.length; i++) {
			map.put(a[i], map.get(a[i]) == null ? 1 : map.get(a[i]) + 1);
		}
		return map.get(k);
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 1, 3, 4, 2, 5, 5, 6, 9, 5, 18 };

		System.out.println("find frequency of ");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		sc.close();

		System.out.printf("frequency of %d is %d", k, frequency(k, a));
	}
}
