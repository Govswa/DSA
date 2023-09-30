package com.dsa.prac.recursion;

public class SumOfNNatural {
	public int sum_1(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	public int sum_2(int n) {
		return (n * (n + 1)) / 2;
	}
	
	public void sum_3(int i, int sum) {
		if(i < 1) {
			System.out.println(sum);
			return;
		}
		
		sum_3(i - 1, sum + i);
	}

	public int sum_4(int n) {
		if(n == 0) {
			return 0;
		}
		return n + sum_4(n - 1);
	}
	
	public static void main(String[] args) {
		SumOfNNatural s = new SumOfNNatural();
		System.out.println(s.sum_1(10));
		
		System.out.println(s.sum_2(10));
		
		s.sum_3(10, 0);
		
		System.out.println(s.sum_4(10));
	}
}
