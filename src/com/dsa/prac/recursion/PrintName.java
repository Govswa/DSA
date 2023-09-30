package com.dsa.prac.recursion;

public class PrintName {

	public void printName(String name, int n) {
		if (n < 1) {
			return;
		}
		System.out.println(name);
		printName(name, n - 1);
	}

	public void printName_1(String name, int i, int n) {
		if (i > n) {
			return;
		}
		System.out.println(name);
		printName_1(name, i + 1, n);
	}

	public static void main(String[] args) {
		PrintName p = new PrintName();
		p.printName("Shiv", 10);

		System.out.println();
		p.printName_1("Krishna", 1, 10);
	}
}
