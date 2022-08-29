package org.example;

import java.util.HashSet;
import java.util.stream.Stream;

class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
    ListNode(){

    }
}
class Solution {
    
    public ListNode deleteDuplicates(ListNode head) {
        ListNode lnode= head;
        while(lnode!= null && lnode.next!=null){

            if(lnode.val == lnode.next.val ){
                if(lnode.next.next!=null){
                    lnode.next=lnode.next.next;
                }
                else{
                    lnode.next=null;
                }
            }
            lnode =lnode.next;
        }
        return head;
    }
}

class Main{
    public static void main(String[] args){
        Solution sol= new Solution();
        ListNode l1=null;
//        l1.next =new ListNode(4);
//        l1.next.next = new ListNode(6);
        ListNode l2=new ListNode(1);
        l2.next =new ListNode(3);
        l2.next.next = new ListNode(5);
        l2.next.next.next = new ListNode(5);
       //ListNode ll= sol.mergeTwoLists(l1,l2);
        ListNode ll = sol.deleteDuplicates(l2);
        System.out.println();
        while(ll!=null){
            System.out.println(ll.val);
            ll=ll.next;
        }
    }
}
