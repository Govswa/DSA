package com.dsa.prac.number;

public class Armstrong {
//153
	public static boolean isArmstrong(int n) {
		int x = n;
		int r = 0;
		int res = 0;
		while (x != 0) {
			r = x % 10;
			res += r * r * r;
			x /= 10;
		}

		if (res == n) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isArmstrong(153));
	}
}
