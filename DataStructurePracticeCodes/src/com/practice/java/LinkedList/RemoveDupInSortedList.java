package com.practice.java.LinkedList;

public class RemoveDupInSortedList {
	private ListNode head;
	
	public static class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data=data;
			this.next=null;
			
		}
	}
	
	public void removeDuplicateFromList() {
		ListNode current=head;
		while(current!=null && current.next!= null) {
			if(current.data==current.next.data) {
				current.next=current.next.next;
			}
			else {
				current=current.next;
			}
		}
	}
	
	public void printListNodes() {
		ListNode current =head;
		while(current!=null) {
			System.err.print(current.data+"-->");
			current=current.next;
			
		}
		System.out.print("null");
		System.out.println();
	}
	
	public static void main(String[] args) {
		RemoveDupInSortedList rdps=new RemoveDupInSortedList();
		rdps.head=new ListNode(10);
		rdps.head.next=new ListNode(10);
		rdps.head.next.next=new ListNode(10);
		rdps.head.next.next.next=new ListNode(11);
	
		rdps.printListNodes();	
		rdps.removeDuplicateFromList();
		rdps.printListNodes(); 
		
		}

}
