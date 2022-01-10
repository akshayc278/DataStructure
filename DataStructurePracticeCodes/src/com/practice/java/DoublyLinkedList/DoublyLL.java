package com.practice.java.DoublyLinkedList;

public class DoublyLL {
	private ListNode head;
	private ListNode tail;
	private int length;
	
	
	private class ListNode{
		private int data;
		private ListNode next;
		private ListNode previous;
		
		public ListNode(int data) {
			this.data=data;
		}
	}
	
	public DoublyLL(){
		this.head=null;
		this.tail=null;
		this.length=0;
	}
	
	public boolean isEmpty() {
		return length==0;
	}
	public void insertIntoDLL(int data){
		ListNode newNode=new ListNode(data);
		if(isEmpty()) {
			head=newNode;
		}else {
			tail.next=newNode;
		}
		newNode.previous=tail;
		tail=newNode;
		length++;
	}
	public void printLL() {
		ListNode curr=head;
		while (curr!=null) {
			System.out.print(curr.data+"-->");
			curr=curr.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		DoublyLL dll=new DoublyLL();
		dll.insertIntoDLL(1);
		dll.insertIntoDLL(2);
		dll.printLL();
	}
}
