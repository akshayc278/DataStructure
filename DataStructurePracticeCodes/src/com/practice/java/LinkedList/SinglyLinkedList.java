package com.practice.java.LinkedList;

public class SinglyLinkedList {

	private ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
//		sll.head=new ListNode(10);
//		
//		ListNode second=new ListNode(1);
//		ListNode third=new ListNode(2);
//		ListNode fourth=new ListNode(3);
//		
//		//now we will connect them 
//		sll.head.next=second;
//		second.next=third;
//		third.next=fourth;
		sll.insertFirst(12);
		sll.insertFirst(11);
		sll.insertLast(13);
		sll.insertFirst(10);
		sll.insertLast(14);

		sll.insertAtGivenPosition(9, 6);
		sll.deleteFirstNode();
		sll.printNodes();
		sll.deleteLastNode();
		sll.deleteLastNode();
		sll.printNodes();
		sll.deleteFromGivenPosition(3);
		sll.printNodes();
		System.out.println(sll.searchAnElement(9));
		System.out.println(sll.countNodes());

	}

	public boolean searchAnElement(int value) {
		ListNode current = head;
		if (head != null) {
			while (current != null) {
				if (current.data == value) {
					return true;
				}
				current = current.next;
			}
		}
		return false;
	}

	public void deleteLastNode() {
		if (head != null) {
			ListNode current = head;
			ListNode prev = null;
			while (current.next != null) {
				prev = current;
				current = current.next;
			}
			prev.next = null;
		}
	}

	public void deleteFirstNode() {
		if (head != null) {
			ListNode temp = head;
			head = head.next;
			temp.next = null;
		}
	}

	public void deleteFromGivenPosition(int position) {
		if (position == 1) {
			deleteFirstNode();
			return;
		}
		ListNode prev = head;
		ListNode current = head;
		while (position > 1) {
			prev = current;
			current = current.next;
			position--;
		}
		prev.next = current.next;

	}

	public void printNodes() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data);
			System.out.print("--->");
			current = current.next;

		}
		System.out.println("null");

	}

	public int countNodes() {
		if (head == null) {
			return 0;
		}
		ListNode current = head;
		int count = 0;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}

	public void insertLast(int value) {
		if (head == null) {
			head = new ListNode(value);
			return;
		}
		ListNode current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = new ListNode(value);
	}

	public void insertAtGivenPosition(int value, int position) {

		if (position == 1) {
			insertFirst(value);
			return;
		}
		ListNode newNode = new ListNode(value);

		ListNode current = head;
		while (position > 2) {
			current = current.next;
			position--;
		}

		newNode.next = current.next;
		current.next = newNode;

	}
}
