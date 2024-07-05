package com.SeleniumJavaPractice;


//Reverse a linked list:

class Node {
	int value;
	Node next;
	
	Node(int value) {
		this.value = value;
		this.next = null;
	}
}

public class ReverseLinkedList {
	public static Node reverse(Node head) {
		Node prev = null;
		Node current = head;
		Node next = null;
		while(current!=null) {
		next = current.next;
		current.next = prev;
		prev = current;
		current = next;
		}
		return prev;
		
	}
	
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		
		System.out.println("Original Linked List");
		printList(head);
		
		Node reversedHead = reverse(head);
		
		System.out.println("\nReversed Linked List");
		printList(reversedHead);
		
		
	}

	private static void printList(Node head) {
		Node current = head;
		while(current!=null) {
			System.out.println(current.value + "");
			current = current.next;
		}
		
	}

}