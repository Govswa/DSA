package com.dsa.prac.array;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

	public static int removeDuplicatesFromSortedArray_1(ArrayList<Integer> arr, int n) {
		int newSize = 1;
		for (int i = 1; i < arr.size(); i++) {
			if (arr.get(i) != arr.get(i - 1)) {
				newSize++;
			}
		}
		return newSize;
	}
	
	public static int removeDuplicatesFromSortedArray(ArrayList<Integer> arr, int n) {
		int i = 0;
		for (int j = 1; j < arr.size(); j++) {
			if (arr.get(i) != arr.get(j)) {
				arr.set(i, arr.get(j));
				i++;
			}
		}
		return i + 1;
	}
	

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 5, 5));
		System.out.println("size of new array: " + removeDuplicatesFromSortedArray(a, a.size()));
		
		ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		System.out.println("size of new array: " + removeDuplicatesFromSortedArray(a1, a1.size()));
	}
}
