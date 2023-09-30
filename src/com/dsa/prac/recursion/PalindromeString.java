package com.dsa.prac.recursion;

public class PalindromeString {
	
	public boolean isPalindrome(String s) {
		for(int i = 0; i < s.length() / 2; i++) {
			if(s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isPalindrome_1(String s) {
		int left = 0, right = s.length() - 1;
		while(left < right) {
			if(s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left ++;
			right--;
		}
		return true;
	}
	
	public boolean isPalindromeRecursive(String s, int i) {
		if(i >= s.length() / 2) {
			return true;
		}
		if(s.charAt(i) != s.charAt(s.length() - 1 -i)) {
			return false;
		}
		return isPalindromeRecursive(s, i + 1);
	}

	public static void main(String[] args) {
		PalindromeString p = new PalindromeString();
		
		System.out.println(p.isPalindrome("ABCDCBA"));
		System.out.println(p.isPalindrome("TAKE U FORWARD"));
		System.out.println(p.isPalindrome("NON"));
		System.out.println(p.isPalindrome("NOEN"));
		
		System.out.println();
		System.out.println(p.isPalindrome_1("ABCDCBA"));
		System.out.println(p.isPalindrome_1("TAKE U FORWARD"));
		System.out.println(p.isPalindrome_1("NON"));
		System.out.println(p.isPalindrome_1("NOEN"));
		
		System.out.println();
		System.out.println(p.isPalindromeRecursive("ABCDCBA", 0));
		System.out.println(p.isPalindromeRecursive("TAKE U FORWARD", 0));
		System.out.println(p.isPalindromeRecursive("NON", 0));
		System.out.println(p.isPalindromeRecursive("NOEN", 0));
	}
}