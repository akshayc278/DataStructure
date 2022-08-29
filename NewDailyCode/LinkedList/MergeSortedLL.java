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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode lNode=new ListNode(0);
        ListNode temp=lNode;
        while(list1 != null  && list2!=null){
            if(list2.val < list1.val){
                lNode.next = new ListNode(list2.val);

                lNode= lNode.next;
                list2 = list2.next;
                System.out.print(lNode.val);
            }
            else {
                lNode.next = new ListNode(list1.val);

                lNode=lNode.next;
                list1 = list1.next;
                System.out.print(lNode.val);
            }
        }
        while(list1!=null){
            lNode.next=new ListNode(list1.val);
            list1 = list1.next;
            lNode=lNode.next;
        }
        while(list2!=null){
            lNode.next=new ListNode(list2.val);
            list2 = list2.next;
            lNode=lNode.next;
        }
        return temp.next;
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
       ListNode ll= sol.mergeTwoLists(l1,l2);
        System.out.println();
        while(ll!=null){
            System.out.println(ll.val);
            ll=ll.next;
        }
    }
}
