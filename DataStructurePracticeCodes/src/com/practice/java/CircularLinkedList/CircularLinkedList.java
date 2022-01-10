package com.practice.java.CircularLinkedList;

public class CircularLinkedList {
	
	private ListNode last;
	private int length;
	
	
	private class ListNode{
		private ListNode next;
		private int data;
		
		public ListNode(int data) {
			this.data=data;
			
		}
	}
	
	public CircularLinkedList() {
		last=null;
		length=0;
	}
	
	public boolean isEmpty() {
		return length==0;
	}
	//Basic implementation
	public void createCircularList() {
		ListNode first=new ListNode(1);
		ListNode second=new ListNode(2);
		ListNode third=new ListNode(3);
		ListNode fourth=new ListNode(4);
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=first;
		last=fourth;
	}
	
	public void display() {
		if(last==null) {
			return;
		}
		ListNode first=last.next;
		while (first!=last) {
			System.out.print(first.data+"-->");
			first=first.next;
		}
		System.out.println(first.data);
	}
	
	public void insertFirst(int data) {
		ListNode temp=new ListNode(data);
		if(last==null) {
			last=temp;
		}else {
			temp.next=last.next;
			
		}
		last.next=temp;
		length++;
	}
	public void insertLast(int data) {
		ListNode temp=new ListNode(data);
		if(last==null) {
			last=temp;
			last.next=last;
		}
		else {
			temp.next=last.next;
			last.next=temp;
			last=temp;
		}
		length++;
	}
	
	public void removeFirst() {
		if(!isEmpty()){
			ListNode temp=last.next;
			if(temp==last) {
				last=null;
			}
			else {
				last.next=temp.next;
			}
			temp.next=null;
			length--;
		}
	}
	public static void main(String[] args) {
		CircularLinkedList cl= new CircularLinkedList();
		cl.createCircularList();
		cl.display();
		cl.insertFirst(0);
		cl.display();
		cl.insertLast(5);
		cl.insertLast(1);
		cl.display();
		cl.removeFirst();
		cl.removeFirst();
		cl.display();
	}

}
