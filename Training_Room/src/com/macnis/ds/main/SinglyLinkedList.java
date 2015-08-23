package com.macnis.ds.main;

/**
 * 
 * @author Micheal.S
 *
 */

public class SinglyLinkedList {

	private Node head;

	private static class Node {

		private Node next;

		private Object data;

		/**
		 * 
		 * @param data
		 */
		public Node(Object data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return this.data.toString();
		}
	}

	public boolean isEmpty() {
		return length() == 0;
	}

	public int length() {
		int lenght = 0;
		Node lCurrentNode = head;

		while (lCurrentNode != null) {
			lenght++;
			lCurrentNode = lCurrentNode.next;
		}
		return lenght;
	}

	public void append(Object data) {

		if (head == null) {
			head = new Node(data);
			return;
		}

		tail().next = new Node(data);
	}

	public Node tail() {

		Node tail = head;

		// Find the last element in the list
		while (tail.next != null) {
			tail = tail.next;
		}
		return tail;
	}
}
