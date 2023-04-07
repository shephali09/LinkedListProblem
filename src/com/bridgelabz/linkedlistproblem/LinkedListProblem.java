package com.bridgelabz.linkedlistproblem;

import java.util.LinkedList;

public class LinkedListProblem {

	void popLast(LinkedList<Integer> linkedlist) {
		linkedlist.pollLast();
	}

	public static void main(String[] args) {

		LinkedListProblem linkedlistproblem = new LinkedListProblem();

		LinkedList<Integer> linkedlist = new LinkedList<Integer>();

		linkedlist.add(56);
		linkedlist.add(30);
		linkedlist.add(70);

		System.out.println(linkedlist);

		linkedlistproblem.popLast(linkedlist);

		System.out.println("After deleting last element:");
		System.out.println(linkedlist);

	}
}
