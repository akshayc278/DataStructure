package com.practice.java.LinkedList;

public class MergeTwoSortedLL {
	private ListNode one;
	private ListNode two;
	
	public static class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public ListNode  megerTwoLL(ListNode a,ListNode b){
		ListNode startZero=new ListNode(0);
		ListNode tail=startZero;
		while(a!=null && b!=null) {
			if(a.data<b.data) {
				tail.next=a;
				tail=tail.next;
				a=a.next;
			}
			else {
				tail.next=b;
				tail=tail.next;
				b=b.next;
			}
		}
		if(a==null) {
			tail.next=b;
		}else {
			tail.next=a;
		}
		startZero=startZero.next;
		return startZero;
	}
	public static void main(String[] args) {
		MergeTwoSortedLL mgl=new MergeTwoSortedLL();
		mgl.one=new ListNode(1);
		mgl.one.next=new ListNode(5);
		
		mgl.two=new ListNode(2);
		mgl.two.next=new ListNode(4);
		
		ListNode ltr=mgl.megerTwoLL(mgl.one, mgl.two);
		ListNode curr=ltr;
		while(ltr!=null) {
			System.out.print(ltr.data+"-->");
			ltr=ltr.next;
		}
		System.out.println("null");
	}
}
