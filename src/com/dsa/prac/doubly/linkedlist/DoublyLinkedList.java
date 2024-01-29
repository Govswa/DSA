package com.dsa.prac.doubly.linkedlist;

import java.util.Scanner;

public class DoublyLinkedList {

	private class Node {
		Node prev;
		int data;
		Node next;

		private Node(Node prev, int data, Node next) {
			this.prev = prev;
			this.data = data;
			this.next = next;
		}
	}

	private Node head;
	private Node tail;

	private Node newNode(int data) {
		return new Node(null, data, null);
	}

	public void insertAtBeg(int data) {
		Node newN = newNode(data);
		if (head == null) {
			head = tail = newN;
		} else {
			newN.next = head;
			head.prev = newN;
			head = newN;
		}
	}

	public void insertAtEnd(int data) {
		Node newN = newNode(data);
		if (tail == null) {
			head = tail = newN;
		} else {
			newN.prev = tail;
			tail.next = newN;
			tail = newN;
		}
	}

	public void insertAfterGivenKey(int data, int key) {
		if (head == null) {
			System.out.println("List is empty");
		} else {
			Node newN = newNode(data);
			Node t = head;
			while (t != null && key != t.data) {
				t = t.next;
			}
			if (t != null && key == t.data) {
				newN.next = t.next;
				newN.prev = t;
				if (t.next != null) {
					t.next.prev = newN;
				} else {
					tail = newN;
				}
				t.next = newN;
			} else {
				System.out.println("Key not found to insert");
			}
		}
	}

	public int deleteFirst() {
		int deletedNode = -1;
		if (head == null) {
			System.out.println("List is empty");
		} else if (head.next == null) {
			deletedNode = head.data;
			head = tail = null;
		} else {
			deletedNode = head.data;
			Node t = head;
			head = head.next;
			head.prev = null;
			t.next = null;
			t = null;
		}
		return deletedNode;
	}

	public int deleteLast() {
		int deletedNode = -1;
		if (head == null) {
			System.out.println("List is empty");
		} else if (head.next == null) {
			deletedNode = tail.data;
			head = tail = null;
		} else {
			Node t = tail;
			deletedNode = tail.data;
			tail = tail.prev;
			tail.next = null;
			t.prev = null;
			t = null;
		}
		return deletedNode;
	}

	public int deleteAny(int key) {
		int deletedNode = -1;
		if (head == null) {
			System.out.println("List is empty");
		} else if (key == head.data) {
			deletedNode = head.data;
			if (head.next == null) {
				head = tail = null;
			} else {
				Node t = head;
				head = head.next;
				head.prev = null;
				t.next = null;
				t = null;
			}
		} else if (key == tail.data) {
			deletedNode = tail.data;
			Node t = tail;
			tail = tail.prev;
			tail.next = null;
			t.prev = null;
			t = null;
		} else {
			Node t = head;
			while (t != null && key != t.data) {
				t = t.next;
			}
			if (t != null && key == t.data) {
				deletedNode = t.data;
				t.prev.next = t.next;
				t.next.prev = t.prev;
				t.prev = t.next = null;
				t = null;
			} else {
				System.out.println("Key not found");
				deletedNode = -2;
			}
		}
		return deletedNode;
	}

	public void moveLastNodeToFront() {

	}

	public void traverseRecurisive() {

	}

	public void traverseReverseRecursive() {

	}

	public void reverse() {

	}

	public void reverseRecursive() {

	}

	public void traverse() {
		if (head == null) {
			System.out.println("List is empty");
		} else {
			Node t = head;
			while (t != null) {
				System.out.print(t.data + " ");
				t = t.next;
			}
		}
	}

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n0.Traverse, " + "1.InsertAtBeg, 2.InsertAtEnd, 3.InsertAfterGivenKey\n"
					+ "4.DeleteFirst, 5.DeleteLast, 6.DeleteAny, 7.MoveLastNodeToFront\n"
					+ "8.TraverseRecurisive, 9.TraverseReverseRecursive\n"
					+ "10.Reverse, 11.ReverseRecursive, 22.Exit\n");
			int ch = sc.nextInt();

			switch (ch) {
			case 0: {
				System.out.print("List: ");
				list.traverse();
				System.out.println();
				break;
			}
			case 1: {
				System.out.print("Enter number: ");
				int data = sc.nextInt();
				list.insertAtBeg(data);
				break;
			}
			case 2: {
				System.out.print("Enter number: ");
				int data = sc.nextInt();
				list.insertAtEnd(data);
				break;
			}
			case 3: {
				System.out.print("Enter number to insert: ");
				int data = sc.nextInt();
				System.out.println("Enter key after that wanted to insert");
				int key = sc.nextInt();
				list.insertAfterGivenKey(data, key);
				break;
			}
			case 4: {
				System.out.print("Delete frist node:\n");
				int deleteFirst = list.deleteFirst();
				if (deleteFirst != -1) {
					System.out.println("deleted first node: " + deleteFirst);
				}
				break;
			}
			case 5: {
				System.out.print("Delete last node: ");
				int deleteLast = list.deleteLast();
				if (deleteLast != -1) {
					System.out.println("deleted last node: " + deleteLast);
				}
				break;
			}
			case 6: {
				System.out.print("Delete any node, Please enter node data wanted to delete: ");
				int key = sc.nextInt();
				int deletedNode = list.deleteAny(key);
				if (deletedNode == -1) {
					System.out.println("Node not found to delete");
				} else if (deletedNode > 0) {
					System.out.println("Node deleted successfully");
				}
				break;
			}
			case 7: {
				System.out.print("Move last node to front:\n");
				list.moveLastNodeToFront();
				break;
			}
			case 8: {
				list.traverseRecurisive();
				System.out.println();
				break;
			}
			case 9: {
				list.traverseReverseRecursive();
				System.out.println();
				break;
			}
			case 10: {
				System.out.println("Reverse List:\n");
				list.reverse();
				System.out.println("List is reversed");
				break;
			}
			case 11: {
				System.out.println("Reverse List in recursive way:\n");
				list.reverseRecursive();
				System.out.println("List is reversed");
				break;
			}
			case 22: {
				sc.close();
				return;
			}
			default:
				System.out.println("Please choose correct option");

			}
		}
	}
}

// learn advantage and disadvantage of circular linked list - https://www.geeksforgeeks.org/applications-advantages-and-disadvantages-of-doubly-linked-list/
