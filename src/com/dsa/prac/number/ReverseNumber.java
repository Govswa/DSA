package com.dsa.prac.number;

public class ReverseNumber {
	
	public static int reverseNumber(int n) {
		int x = n;
		int rev = 0;
		while(x != 0) {
			rev = rev * 10 + x % 10;
			x /= 10;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		System.out.println(reverseNumber(678));
	}
}
