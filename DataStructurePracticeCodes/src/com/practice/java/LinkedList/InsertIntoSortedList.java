package com.practice.java.LinkedList;

public class InsertIntoSortedList {
	private ListNode head;
	
	public static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	
	public void insertIntoSortedListMethod(int data) {
		ListNode current =head;
		ListNode prev=null;
		ListNode newNode=new ListNode(data);
		if(current.data>data) {
			newNode.next=current;
			head=newNode;
			return;
		}
		while(current!=null && current.data<data) {
			prev=current;
			current=current.next;
		}
		
		newNode.next=current;
		prev.next=newNode;
	}
	
	public void printList() {
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.print("null");
		System.out.println();
	}
	public static void main(String[] args) {
		InsertIntoSortedList ist=new InsertIntoSortedList();
		ist.head=new ListNode(10);
		ist.head.next=new ListNode(11);
		ist.insertIntoSortedListMethod(9);
		ist.printList();
	}
}
