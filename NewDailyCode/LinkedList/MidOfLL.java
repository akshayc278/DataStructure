class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int count=0;
        while(head.next!=null && head.next.next!=null){
            head=head.next.next;
            count+=2;
        }
        if(head.next!=null){
            count++;
        }
        if(count%2!=0){
            count++;
        }
        for(int i=0;i<count/2;i++){
            temp=temp.next;
        }
        return temp;
    }
}
