package com.dsa.prac.queue;

import java.util.Scanner;

//Circular queue
public class Queue {

	private int SIZE = 5;
	int[] q = new int[SIZE];
	int front = -1, rear = -1;

	public void enqueue(int item) {
		if (!isFull()) {
			q[++rear] = item;
		}
	}

	public int dequeue() {
		if (!isEmpty()) {
			int front = q[0];
			for (int i = 0; i < rear; i++) {
				q[i] = q[i + 1];
			}
			rear--;
			return front;
		}
		return -1;
	}

	public int peek() {
		if (!isEmpty()) {
			return q[0];
		}
		return -1;
	}

	public int rear() {
		if (!isEmpty()) {
			return q[rear];
		}
		return -1;
	}

	public boolean isEmpty() {
		if (rear == -1) {
			System.out.println("Queue is empty");
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (rear == SIZE - 1) {
			System.out.println("Queue is full");
			return true;
		}
		return false;
	}

	public void printQueue() {
		if (!isEmpty()) {
			for (int i = 0; i <= rear; i++) {
				System.out.print(q[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		Queue q = new Queue();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("\n0.PrintQueue, 1.Enqueue, 2.Dequeue, 3.Peek, 4.Rear 22.Exit");
			int ch = sc.nextInt();
			switch (ch) {
			case 0: {
				System.out.print("Queue: ");
				q.printQueue();
				break;
			}
			case 1: {
				System.out.println("Enter item");
				int item = sc.nextInt();
				q.enqueue(item);
				break;
			}
			case 2: {
				System.out.println("Dequeue item: ");
				int dequeueDItem = q.dequeue();
				if (dequeueDItem != -1) {
					System.out.println("Poped item: " + dequeueDItem);
				}
				break;
			}
			case 3: {
				System.out.print("Peek item: ");
				int front = q.peek();
				if (front == -1) {
					System.out.println("Queue is empty");
				} else {
					System.out.print(front);
				}
				break;
			}
			case 4: {
				System.out.print("Rear item: ");
				int rear = q.rear();
				if (rear == -1) {
					System.out.println("Queue is empty");
				} else {
					System.out.print(rear);
				}
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
