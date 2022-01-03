package com.practice.java.LinkedList;

public class FindMiddleOfList {

	private ListNode head;
	
	public static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public int getMiddleNode() {
		if(head!=null) {
			ListNode current=head;
			ListNode slowPointer=head;
			while(current!=null && current.next!=null) {
				slowPointer=slowPointer.next;
				current=current.next.next;
			}
			return slowPointer.data;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		FindMiddleOfList fml=new FindMiddleOfList();
		fml.head=new ListNode(1);
		fml.head.next=new ListNode(2);
		fml.head.next.next=new ListNode(3);
		fml.head.next.next.next= new ListNode(4);
		fml.head.next.next.next.next=new ListNode(5);
		
		System.out.println(fml.getMiddleNode());
	}
	
}
