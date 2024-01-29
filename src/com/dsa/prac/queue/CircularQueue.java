package com.dsa.prac.queue;

import java.util.Scanner;

//Circular queue
public class CircularQueue {

	private int SIZE = 5;
	int[] q = new int[SIZE];
	int front = -1, rear = -1;

	public void enqueue(int item) {
		rear = (rear + 1) % SIZE;
		if (rear == front) {
			System.out.println("Queue is full");
			if (rear == 0) {
				rear = SIZE - 1;
			} else {
				rear = rear - 1;
			}
		} else {
			q[rear] = item;
		}
	}

	public int dequeue() {
		int deletedItem = -1;
		if (front == rear) {
			System.out.println("Queue is empty");
		} else {
			front = (front + 1) % SIZE;
			deletedItem = q[front];
		}
		return deletedItem;
	}

	public int front() {
		if (front != rear) {
			return q[front];
		}
		return -1;
	}

	public int rear() {
		if (rear != front) {
			return q[rear];
		}
		return -1;
	}

	public void printQueue() {
		if (front != rear) {
			rear = (rear + 1) % SIZE;
			if (rear == 0) {
				rear = SIZE - 1;
			} else {
				rear = rear - 1;
			}
			for (int i = front + 1; i <= rear; i++) {
				System.out.print(q[i] + " ");
			}
		} else {
			System.out.println("Queue is empty");
		}
	}

	public static void main(String[] args) {
		CircularQueue q = new CircularQueue();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("\n0.PrintQueue, 1.Enqueue, 2.Dequeue, 22.Exit");
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
				System.out.print("Front item: ");
				int front = q.front();
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
