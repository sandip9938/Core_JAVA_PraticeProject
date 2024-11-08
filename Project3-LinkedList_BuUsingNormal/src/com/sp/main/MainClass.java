package com.sp.main;

class LinkedList {
	// Inner Node class
	class Node {
		String dataString;
		Node nextNode;

		public Node(String data) {
			this.dataString = data;
			this.nextNode = null;
		}
	}

	// Head of the linked list
	private Node head;

	// Add an element to the beginning of the list
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.nextNode = head;
			head = newNode;
		}
	}

	// Add an element to the end of the list
	public void addLast(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node currNode = head;
		while (currNode.nextNode != null) {
			currNode = currNode.nextNode;
		}
		currNode.nextNode = newNode;
	}

	// Print the linked list
	public void printList() {
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.dataString + " -> ");
			currNode = currNode.nextNode;
		}
		System.out.println("null");
	}

	// Delete a element to the first of the list
	public void deleteFirst() {
		if (head == null) {
			System.out.println("The list is empty");
			return;
		}
		head = head.nextNode;
	}

	// Delete a element to the end of the list
	public void deleteLast() {
		if (head == null) {
			System.out.println("The list is empty");
			return;
		}
		if (head.nextNode == null) {
			head = null;
		}
		Node secondNode = head;
		Node lastNode = head.nextNode;
		while (lastNode.nextNode != null) {
			lastNode = lastNode.nextNode;
			secondNode = secondNode.nextNode;
		}
		secondNode.nextNode = null;
	}

}

public class MainClass {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		// Test addFirst and addLast methods
		list.addFirst("Node1");
		list.addLast("Node2");
		list.addFirst("Node0");
		list.addLast("Node3");
		list.addLast("Node4");

		// Print the linked list
		list.printList(); // Expected Output: Node0 -> Node1 -> Node2 -> Node3 -> null
		list.deleteFirst(); // Expected Output: Node1 -> Node2 -> Node3 -> null
		list.printList();
		list.deleteLast(); // Expected Output: Node1 -> Node2 ->null
		list.printList();
		
	}
}
