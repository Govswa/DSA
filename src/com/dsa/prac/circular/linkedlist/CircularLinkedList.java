package com.dsa.prac.circular.linkedlist;

import java.util.Scanner;

public class CircularLinkedList {

	private class Node {
		int data;
		Node next;

		private Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node head;

	private Node newNode(int data) {
		return new Node(data, null);
	}

	public void insertAtBeg(int data) {
		Node newN = newNode(data);
		if (head == null) {
			head = newN;
			head.next = head;
		} else {
			Node t = head;
			while (t.next != head) {
				t = t.next;
			}
			newN.next = head;
			head = newN;
			t.next = head;
		}
	}

	public void insertAtEnd(int data) {
		
	}

	public void insertAfterGivenKey(int data, int key) {

	}

	public int deleteFirst() {
		return 0;
	}

	public int deleteLast() {
		return 0;
	}

	public int deleteAny(int key) {
		return 0;
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
			do { // if there is only one node
				System.out.print(t.data + " ");
				t = t.next;
			} while (t != head);
		}
	}

	public static void main(String[] args) {
		CircularLinkedList list = new CircularLinkedList();
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
				System.out.print("Delete frist node: ");
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

// learn advantage and disadvantage of circular linked list - https://www.geeksforgeeks.org/circular-linked-list/
