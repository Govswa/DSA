package com.dsa.prac.recursion;

public class PrintOneToN {
	
	public void printN(int i, int n) {
		if(i > n) {
			return;
		}
		System.out.println(i);
		printN(i + 1, n);
	}
	
	public static void main(String[] args) {
		PrintOneToN p = new PrintOneToN();
		p.printN(1, 10);
	}
}
