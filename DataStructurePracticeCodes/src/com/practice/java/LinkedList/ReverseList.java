package com.practice.java.LinkedList;

public class ReverseList {
	private ListNode head;
	
	public static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public void reverseList() {
		ListNode prev=null;
		ListNode curr=head;
		while(curr!=null) {
			ListNode next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;	
		}
		head=prev;
	}
	public void insertFirst(int data) {
		if (head==null) {
			head=new ListNode(data);
			return;
		}
		ListNode newNode=new ListNode(data);
		newNode.next=head;
		head=newNode;
	}
	
	public void printList() {
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.data);
			System.out.print("-->");
			current=current.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		ReverseList rl=new ReverseList();
		rl.insertFirst(10);
		rl.insertFirst(9);
		rl.insertFirst(8);
		rl.insertFirst(19);
		rl.printList();
		rl.reverseList();
		rl.printList();
	}

}
