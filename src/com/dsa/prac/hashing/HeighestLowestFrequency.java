package com.dsa.prac.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class HeighestLowestFrequency {

	public static Map<Integer, Integer> heighestLowestFrequency(int[] a) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			map.put(a[i], map.get(a[i]) == null ? 1 : map.get(a[i]) + 1);
		}

		int maxFrequency = 0, maxElement = 0;
		int minFrequency = Integer.MAX_VALUE, minElement = 0;

		for (Entry<Integer, Integer> entry : map.entrySet()) {
			int element = entry.getKey();
			int freqeuncy = entry.getValue();

			if (maxFrequency < freqeuncy) {
				maxFrequency = freqeuncy;
				maxElement = element;
			}

			if (minFrequency > freqeuncy) {
				minFrequency = freqeuncy;
				minElement = element;
			}
		}

		map.clear();
		map.put(minElement, minFrequency);
		map.put(maxElement, maxFrequency);

		return map;
	}

	public static void main(String[] args) {
		int[] a = { 10, 5, 10, 15, 10, 5 };
		Map<Integer, Integer> map = heighestLowestFrequency(a);

		map.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
	}
}
