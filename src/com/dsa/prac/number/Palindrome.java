package com.dsa.prac.number;

public class Palindrome {

	public static boolean isPalindrome(int n) {
		if (n == ReverseNumber.reverseNumber(n)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(123321));
	}
}
