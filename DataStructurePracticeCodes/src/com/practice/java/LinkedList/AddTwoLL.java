package com.practice.java.LinkedList;
//input 7->5->2->null
//     +1->5->null
//    --------1----carry
//      8->0->3->null  
public class AddTwoLL {

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
	
	public ListNode addTwoLL(ListNode a,ListNode b) {
		int carry=0;
		ListNode startNode=new ListNode(0);
		ListNode tail=startNode;
		while (a!=null || b!=null) {
			int d1=a!=null?a.data:0;
			int d2=b!=null?b.data:0;
			int result=d1+d2+carry;
			int nodeData=result%10;
			tail.next=new ListNode(nodeData);
			tail=tail.next;
			carry=result/10;
			if(a!=null)a=a.next;
			if(b!=null)b=b.next;
			
		}
		return startNode.next;
	}
	
	public static void main(String[] args) {
		AddTwoLL al=new AddTwoLL();
		al.one=new ListNode(7);
		al.one.next=new ListNode(5);
		al.one.next.next=new ListNode(2);
		
		al.two=new ListNode(1);
		al.two.next=new ListNode(5);
		
		ListNode ll=al.addTwoLL(al.one, al.two);
		ListNode curr=ll;
		
		while(curr!=null) {
			System.out.print(curr.data+"-->");
			curr=curr.next;
		}
		System.out.println("null");
		
	}
	
	
}
