package com.dsa.prac.singly.linkedlist;

import java.util.Scanner;

public class SingleLinkedList {

	private class Node {
		int data;
		Node next;

		private Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node head;

	public void insertAtFirst(int data) {
		Node newN = newNode(data);
		if (head == null) {
			head = newN;
		} else {
			newN.next = head;
			head = newN;
		}
	}

	public void insertAtLast(int data) {
		Node newNode = newNode(data);
		if (head == null) {
			head = newNode;
		} else {
			Node t = head;
			while (t.next != null) {
				t = t.next;
			}
			t.next = newNode;
		}
	}

	public void insertAfterGivenKey(int data, int key) {
		if (head == null) {
			System.out.println("List is empty");
		} else {
			Node t = head;
			while (t != null && t.data != key) {
				t = t.next;
			}
			if (t == null) {
				System.out.println("Please choose correct key");
			} else {
				Node newNode = newNode(data);
				newNode.next = t.next;
				t.next = newNode;
			}
		}
	}

	public int deleteFirst() {
		int deletedNode = -1;
		if (head == null) {
			System.out.println("List is empty");
			return -1;
		} else {
			Node t = head;
			head = head.next;

			deletedNode = t.data;
			t = null;
		}

		return deletedNode;
	}

	public int deleteLast() {
		int deletedNode = -1;
		if (head == null) {
			System.out.println("List is empty");
		} else if (head.next == null) {
			deletedNode = head.data;
			head = null;
		} else {
			Node t = head;
			while (t.next.next != null) {
				t = t.next;
			}
			deletedNode = t.next.data;
			t.next = null;
		}
		return deletedNode;
	}

	public int deleteAny(int key) {
		int deletedNode = -1;
		if (head == null) {
			System.out.println("List is empty");
			deletedNode = -2;
		} else if (key == head.data) {
			deletedNode = head.data;
			head = head.next;
		} else {
			Node t = head;
			Node p = t;
			while (t != null && key != t.data) {
				p = t;
				t = t.next;
			}
			if (t != null && key == t.data) {
				p.next = t.next;
				deletedNode = t.data;
				t = null;
			}
		}
		return deletedNode;
	}

	public void moveLastNodeToFront() {
		if (head == null) {
			System.out.println("List is empty");
		} else if (head.next == null) {
			return;
		} else {
			Node t = head;
			while (t.next.next != null) {
				t = t.next;
			}
			t.next.next = head;
			head = t.next;
			t.next = null;
		}
		System.out.println("last node moved to front");
	}

	public void traverseRecurisive() {
		traverseR(head);
	}

	private void traverseR(Node t) {
		if (t != null) {
			System.out.print(t.data + " ");
			traverseR(t.next);
		}
	}

	public void traverseReverseRecursive() {
		traverseReverseR(head);
	}

	private void traverseReverseR(Node t) {
		if (t != null) {
			traverseReverseR(t.next);
			System.out.print(t.data + " ");
		}
	}

	public void reverse() {
		if (head == null) {
			System.out.println("List is empty");
		} else {
			Node cur = head, prev = null, nextN = null;
			while (cur != null) {
				nextN = cur.next;
				cur.next = prev;
				prev = cur;
				cur = nextN;
			}
			head = prev;
		}
	}

	public void reverseRecursive() {
		if (head == null) {
			System.out.println("List is empty");
		} else {
			reverseRec(null, head);
		}
	}

	private void reverseRec(Node prev, Node cur) {
		if (cur != null) {
			reverseRec(cur, cur.next);
			cur.next = prev;
		} else {
			head = prev;
		}
	}

	public void traverse() {
		if (head == null) {
			System.out.println("List is empty");
		} else {
			System.out.print("List: ");
			Node t = head;
			while (t != null) {
				System.out.print(t.data + " ");
				t = t.next;
			}
		}
	}

	private Node newNode(int data) {
		return new Node(data, null);
	}

	public static void main(String[] args) {
		SingleLinkedList linkedList = new SingleLinkedList();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n0.Exit, " + "1.InsertBefore, 2.InsertAtLast, 3.InsertAfterGivenKey\n"
					+ "4.DeleteFirst, 5.DeleteLast, 6.DeleteAny, 7.MoveLastNodeToFront\n"
					+ "8.Traverse, 9.TraverseRecurisive, 10.TraverseReverseRecursive\n"
					+ "11.Reverse, 12.ReverseRecursive\n");
			int ch = sc.nextInt();
			switch (ch) {
			case 1: {
				System.out.print("Enter number: ");
				int data = sc.nextInt();
				linkedList.insertAtFirst(data);
				break;
			}
			case 2: {
				System.out.print("Enter number: ");
				int data = sc.nextInt();
				linkedList.insertAtLast(data);
				break;
			}
			case 3: {
				System.out.print("Enter number to insert: ");
				int data = sc.nextInt();
				System.out.println("Enter key after that wanted to insert");
				int key = sc.nextInt();
				linkedList.insertAfterGivenKey(data, key);
				break;
			}
			case 4: {
				System.out.print("Delete frist node: ");
				int deleteFirst = linkedList.deleteFirst();
				if (deleteFirst != -1) {
					System.out.println("deleted first node: " + deleteFirst);
				}
				break;
			}
			case 5: {
				System.out.print("Delete last node: ");
				int deleteLast = linkedList.deleteLast();
				if (deleteLast != -1) {
					System.out.println("deleted last node: " + deleteLast);
				}
				break;
			}
			case 6: {
				System.out.print("Delete any node, Please enter node data wanted to delete: ");
				int key = sc.nextInt();
				int deletedNode = linkedList.deleteAny(key);
				if (deletedNode == -1) {
					System.out.println("Node not found to delete");
				} else if (deletedNode > 0) {
					System.out.println("Node deleted successfully");
				}
				break;
			}
			case 7: {
				System.out.print("Move last node to front:\n");
				linkedList.moveLastNodeToFront();
				break;
			}
			case 8: {
				linkedList.traverse();
				System.out.println();
				break;
			}
			case 9: {
				linkedList.traverseRecurisive();
				System.out.println();
				break;
			}
			case 10: {
				linkedList.traverseReverseRecursive();
				System.out.println();
				break;
			}
			case 11: {
				System.out.println("Reverse List:\n");
				linkedList.reverse();
				System.out.println("List is reversed");
				break;
			}
			case 12: {
				System.out.println("Reverse List in recursive way:\n");
				linkedList.reverseRecursive();
				System.out.println("List is reversed");
				break;
			}
			case 0: {
				sc.close();
				return;
			}
			default:
				System.out.println("Please choose correct option");
			}
		}
	}
}

//learn advantage and disadvantage of circular linked list - https://www.geeksforgeeks.org/what-is-linked-list/
