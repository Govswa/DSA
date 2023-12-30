package com.dsa.prac.array;

import java.util.ArrayList;
import java.util.List;

public class MoveAllZerosToEnd {

	public static void moveAllZerosToEndBruteForce(int[] a) {
		List<Integer> nonZero = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				nonZero.add(a[i]);
			}
		}

		for (int i = 0; i < nonZero.size(); i++) {
			a[i] = nonZero.get(i);
		}

		for (int i = nonZero.size(); i < a.length; i++) {
			a[i] = 0;
		}
	}

	public static void moveAllZerosToEnd(int[] a) {
		int j = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				j = i;
				break;
			}
		}
		if (j == -1)
			return;

		for (int i = j + 1; i < a.length; i++) {
			if (a[i] != 0) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				j++;
			}
		}
	}

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] a = { 1, 0, 2, 3, 0, 4, 0, 1 };
		moveAllZerosToEndBruteForce(a);
		printArray(a);
		System.out.println();
		
		moveAllZerosToEnd(a);
		printArray(a);
	}
}
