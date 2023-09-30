package com.dsa.prac.recursion;

public class Fibonacci {
	public void fibonacci(int n) {
		if (n >= 1) {
			System.out.print("0 1 ");
		} else {
			System.out.print("0 ");
		}

		int a = 0, b = 1, c = 0;
		int i = 0;
		while (i <= n - 2) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
			i++;
		}
	}

	// fib(i) = fib(i-1) + fib(i-2)
	public void fibbonacci_1(int n) {
		if (n == 0) {
			System.out.println("0");
		} else {
			int fib[] = new int[n + 1];
			fib[0] = 0;
			fib[1] = 1;
			for (int i = 2; i <= n; i++) {
				fib[i] = fib[i - 1] + fib[i - 2];
			}

			PrintArray.printArray(fib);
		}
	}

	// print the Nth Fibonacci number using functional recursion with multiple function calls.
	//
	//fib(2) = fib(1) + fib(0) mean if n >= 2
	//fib(n) = fib(n - 1) + fib(n - 2) n >= 2
	//Base condition n < 2 return n
	public int fib(int n) {
		if (n < 2) {
			return n;
		}
		return fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {
		Fibonacci fib = new Fibonacci();

		fib.fibonacci(0);
		System.out.println();
		fib.fibonacci(5);
		System.out.println();
		fib.fibonacci(6);
		System.out.println();
		fib.fibonacci(8);

		System.out.println("\n");
		fib.fibbonacci_1(0);
		fib.fibbonacci_1(5);
		fib.fibbonacci_1(6);
		fib.fibbonacci_1(8);

		System.out.println("\n");
		System.out.println(fib.fib(0));
		System.out.println(fib.fib(1));
		System.out.println(fib.fib(2));
		System.out.println(fib.fib(3));
		System.out.println(fib.fib(4));
		System.out.println(fib.fib(5));
		System.out.println(fib.fib(6));
		System.out.println(fib.fib(8));
	}
}
