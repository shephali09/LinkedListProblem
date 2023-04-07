package com.bridgelabz.linkedlistproblem;

/*create a simple Linked List
of 56, 30 and 70*/

import java.util.LinkedList;

public class LinkedListProblem {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public static void main(String[] args) {
		LinkedListProblem linkedList = new LinkedListProblem();

		linkedList.head = new Node(56);
		Node second = new Node(30);
		Node Third = new Node(70);

		linkedList.head.next = second;
		second.next = Third;

		// Print the Data with Values
		while (linkedList.head != null) {
			System.out.println(linkedList.head.data);
			linkedList.head = linkedList.head.next;
		}
	}

}
