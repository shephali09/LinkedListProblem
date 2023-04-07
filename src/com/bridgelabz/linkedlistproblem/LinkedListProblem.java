package com.bridgelabz.linkedlistproblem;

import java.util.*;

public class LinkedListProblem {

	public static void main(String[] args) {

		LinkedListProblem linkedlistproblem = new LinkedListProblem();

		LinkedList<Integer> linkedlist = new LinkedList<Integer>();

		linkedlist.add(56);
		linkedlist.add(30);
		linkedlist.add(70);

		System.out.println(linkedlist);

		ListIterator iterator = linkedlist.listIterator();

		while (iterator.hasNext()) {
			Integer i = (Integer) iterator.next();
			if (i == 30) {
				iterator.add(40);
				System.out.println("After adding value 40");
			}
		}
		System.out.println(linkedlist);

	}
}
