package com.practice.java.DoublyLinkedList;

public class DeleteNode {
	
	private ListNode head;
	private ListNode tail;
	private int length;
	
	public static class ListNode{
		private ListNode next;
		private ListNode prev;
		private int data;
		public ListNode(int data) {
			this.data=data;
		}
	}
	public DeleteNode(){
		this.head=null;
		this.tail=null;
		this.length=0;
	}
	public boolean isEmpty() {
		return length==0;
	}
	public ListNode deleteLastNode() {
		if(isEmpty()) {
			return null;
		}
		ListNode temp=tail;
		if(head==tail) {
			head=null;
		}else {
			tail.prev.next=null;
		}
		tail=tail.prev;
		temp.prev=null;
		length--;
		return temp;
	}
	public ListNode deleteFirstNode()
	{
		if(isEmpty()) {
			return null;	
		}
		ListNode temp=head;
		if(head==tail)
		{
			tail=null;
		}
		else {
			head.next.prev=null;
		}
		head=head.next;
		temp.next=null;
		length--;
		return temp;
	}
	
	public void insertNode(int data) {
		ListNode newNode=new ListNode(data);
		if(isEmpty()) {
			head=newNode;
		}
		else {
			tail.next=newNode;
			
		}
		newNode.prev=tail;
		tail=newNode;
		length++;
	}
	public static void main(String[] args) {
		DeleteNode dfn=new DeleteNode();
		dfn.insertNode(10);
		dfn.insertNode(11);
		System.out.println(dfn.deleteFirstNode().data);
		dfn.insertNode(12);
		System.out.println(dfn.deleteLastNode().data);
		
		
		
	}
}
