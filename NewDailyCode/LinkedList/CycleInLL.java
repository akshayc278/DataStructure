public class Solution {
    public boolean hasCycle(ListNode head) {
        boolean flag=false;
        ListNode l1=head;
        ListNode l2=null;
        if(head !=null && head.next!=null){
            l2=head.next.next;
        }
        else {
            flag=false;
            return flag;
        }
        while(l2!=null && l1!=null && l2.next!=null ){
            if(l1==l2){
                flag=true;
                break;
            }
            else {
                l1=l1.next;
                l2=l2.next.next;
            }
        }
        return flag;
    }
}
