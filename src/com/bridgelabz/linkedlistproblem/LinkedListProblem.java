package com.bridgelabz.linkedlistproblem;

import java.util.LinkedList;

public class LinkedListProblem {

	void pop(LinkedList<Integer> linkedlist) {
		linkedlist.pop();
	}

	public static void main(String[] args) {

		LinkedListProblem list = new LinkedListProblem();

		LinkedList<Integer> linkedlist = new LinkedList<Integer>();

		linkedlist.add(56);
		linkedlist.add(70);
		linkedlist.add(1, 30);

		System.out.println(linkedlist);

		list.pop(linkedlist);

		System.out.println("After removing first element:");
		System.out.println(linkedlist);

	}
}
