package com.practice.java.DoublyLinkedList;

public class InsertAtBegining {
	
	private ListNode head;
	private ListNode tail;
	private int length;
	
	public static class ListNode{
		private int data;
		private ListNode next;
		private ListNode prev;
		public ListNode(int data) {this.data=data;}
	}
	
	public InsertAtBegining(){
		this.head=null;
		this.tail=null;
		this.length=0;
	}
	public boolean isEmpty(){
		return length==0;
	}
	
	public void insertAtBeg(int data) {
		ListNode newNode=new ListNode(data);
		if(isEmpty()) {
			tail=newNode;
		}
		else {
			head.prev=newNode;
		}
		newNode.next=head;
		head=newNode;
		length++;
	}
	
	public static void main(String[] args) {
		InsertAtBegining isb=new InsertAtBegining();
		isb.insertAtBeg(2);
		isb.insertAtBeg(3);
		ListNode curr=isb.head;
		while(curr!=null) {
			
			System.out.print(curr.data+"-->");
			curr=curr.next;
		}
		System.out.println("null");
	}

}
