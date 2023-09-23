package com.dsa.prac.number;

public class CountdigitsInNumber {

	public static int countdigitsInNumber(int n) {
		int count = 0;
		while(n != 0) {
			n /= 10;
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(countdigitsInNumber(1000000));
	}
}

/*
 Problem - 
 https://takeuforward.org/data-structure/count-digits-in-a-number/
*/