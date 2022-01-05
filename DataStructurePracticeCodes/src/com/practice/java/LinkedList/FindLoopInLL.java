package com.practice.java.LinkedList;

public class FindLoopInLL {

		private ListNode head;
		
		public static class ListNode{
			private int data;
			private ListNode next;
			
			public ListNode(int data) {
				this.data=data;
				this.next=null;
			}
		}
		
		public boolean findLoop() {
			ListNode fastPointer=head;
			ListNode slowPointer=head;
			while (fastPointer!=null && fastPointer.next!=null) {
				fastPointer=fastPointer.next.next;
				slowPointer=slowPointer.next;
				if(fastPointer==slowPointer) {
					return true;
				}
			}
			return false;
		}
		
		public ListNode findStartOfLoop() {
			ListNode fastPointer=head;
			ListNode slowPointer=head;
			while(fastPointer!=null && fastPointer.next!=null) {
				fastPointer=fastPointer.next.next;
				slowPointer=slowPointer.next;
				if(fastPointer==slowPointer) {
					return findStart(slowPointer);
				}
			}
			return null;
		}
		private ListNode findStart(ListNode slowNode) {
			ListNode temp=head;
			while(temp!=slowNode) {
				slowNode=slowNode.next;
				temp=temp.next;
			}
			return temp;
		}
		
		public void removeLoop() {
			ListNode fastPointer=head;
			ListNode slowPointer=head;
			while(fastPointer!=null && fastPointer.next!=null) {
				fastPointer=fastPointer.next.next;
				slowPointer=slowPointer.next;
				if(fastPointer==slowPointer) {
					removeLoopList(slowPointer);
				}
			}
		}

		private void removeLoopList(ListNode slowNode) {
			ListNode temp=head;
			while(temp.next!=slowNode.next) {
				temp=temp.next;
				slowNode=slowNode.next;
				
			}
			slowNode.next=null;
			
		}

		public static void main(String[] args) {
			FindLoopInLL fil= new FindLoopInLL();
			fil.head=new ListNode(9);
			fil.head.next=new ListNode(10);
			fil.head.next.next=new ListNode(11);
			ListNode p=new ListNode(12);
			fil.head.next.next.next=p;
			p.next=new ListNode(13);
			p.next.next=p;
			System.out.println(fil.findLoop());
			System.out.println(fil.findStartOfLoop().data);
			fil.removeLoop();
			System.out.println(fil.findStartOfLoop());
			
		}
}
