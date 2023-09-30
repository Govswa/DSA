package com.dsa.prac.recursion;

public class PrintNToOne {

	public void printN(int n) {
		if (n < 1) {
			return;
		}
		System.out.println(n);
		printN(n - 1);
	}

	public static void main(String[] args) {
		PrintNToOne p = new PrintNToOne();
		p.printN(10);
	}
}
