package com.dsa.prac.stack;

import java.util.Scanner;

public class Stack {

	private int top = -1;
	private int MAX = 10;
	private int[] stack = new int[MAX];
	private int capacity = 0;

	public void push(int item) {
		if (top == MAX - 1) {
			System.out.println("Overflow");
		} else {
			stack[++top] = item;
			capacity++;
		}
	}

	public int pop() {
		int popedItem = -1;
		if (top == -1) {
			System.out.println("Underflow");
		} else {
			popedItem = stack[top--];
			capacity--;
		}
		return popedItem;
	}

	public int peek() {
		int peek = -1;
		if (top == -1) {
			System.out.println("Underflow");
		} else {
			peek = stack[top];
		}
		return peek;
	}

	public int capacity() {
		return capacity;
	}

	public void printStack() {
		if (top == -1) {
			System.out.println("Underflow");
		} else {
			for (int i = 0; i < capacity; i++) {
				System.out.print(stack[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		Stack stack = new Stack();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("\n0.PrintStack, 1.Push, 2.Pop, 3.Peek, 4.Capacity, 22.Exit");
			int ch = sc.nextInt();
			switch (ch) {
			case 0: {
				System.out.print("Stack: ");
				stack.printStack();
				break;
			}
			case 1: {
				System.out.println("Enter item");
				int item = sc.nextInt();
				stack.push(item);
				break;
			}
			case 2: {
				System.out.println("Pop item: ");
				int popedItem = stack.pop();
				if (popedItem != -1) {
					System.out.println("Poped item: " + popedItem);
				}
				break;
			}
			case 3: {
				System.out.print("Peek item: ");
				int peek = stack.peek();
				if (peek != -1) {
					System.out.println(peek);
				}
				break;
			}
			case 4: {
				System.out.println("Capacity: " + stack.capacity());
				break;
			}
			case 22: {
				sc.close();
				return;
			}
			default: {
				System.out.println("Please choose correct option");
			}
			}
		}
	}
}
