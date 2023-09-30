package com.dsa.prac.hashing;

import java.util.Scanner;

public class FrequencyUsingHashing {

	private static final int SIZE = 1000000000;

	public static int frequency(int k, int[] a) {
		int[] hashTable = new int[SIZE];

		for (int i = 0; i < a.length; i++) {
			if (a[i] < SIZE)
				hashTable[a[i]]++;
		}

		if(k < SIZE)
		return hashTable[k];
		throw new RuntimeException("Please enter k less than " + SIZE + "\n array should contain element less than " + SIZE);
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 1, 3, 4, 2, 5, 5, 6, 9, 5,18 };

		System.out.println("find frequency of ");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		sc.close();

		System.out.printf("frequency of %d is %d", k, frequency(k, a));
	}
}
