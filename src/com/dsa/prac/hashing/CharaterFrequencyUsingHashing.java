package com.dsa.prac.hashing;

import java.util.Scanner;

public class CharaterFrequencyUsingHashing {

	private static final int SIZE = 26;

	public static int frequency(char c, String s) {
		int[] hashTable = new int[SIZE];

		for (int i = 0; i < s.length(); i++) {
				hashTable[s.charAt(i) - 97]++;
		}

		return hashTable[c - 'a'];
	}

	public static int frequency_(char c, String s) {
		int SIZE = 255;
		int[] hashTable = new int[SIZE];

		for (int i = 0; i < s.length(); i++) {
				hashTable[s.charAt(i)]++;
		}

		return hashTable[c];
	}
	
	public static void main(String[] args) {
		String s = "aabcdeffa";

		System.out.println("find frequency of ");
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		sc.close();

		System.out.printf("frequency of %c is %d", c, frequency(c, s));
		System.out.printf("\nfrequency of %c is %d", c, frequency_(c, s));
	}
}
