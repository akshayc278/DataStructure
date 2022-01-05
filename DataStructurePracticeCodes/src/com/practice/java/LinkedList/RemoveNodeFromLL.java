package com.practice.java.LinkedList;

public class RemoveNodeFromLL {
	
	private ListNode head;
	public static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	
	public void  removeNode(int data) {
		ListNode current=head;
		ListNode prev=head;
		if(head.data==data) {
			head=current.next;
			return;
		}
		while(current!=null&& current.data!=data) {
			prev=current;
			current =current.next;
		}
		prev.next=current.next;
		
	}
	public void printLL() {
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.data+"-->");
			current=current.next;
			
		}
		System.out.print("null");
		System.out.println();
	}
	
	public static void main(String[] args) {
		RemoveNodeFromLL rm=new RemoveNodeFromLL();
		rm.head=new ListNode(12);
		rm.head.next=new ListNode(10);
		rm.head.next.next=new ListNode(11);
		rm.printLL();
		rm.removeNode(10);
		rm.printLL();
	}
}
