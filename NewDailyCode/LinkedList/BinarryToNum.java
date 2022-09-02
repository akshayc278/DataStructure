class Solution {
    public int getDecimalValue(ListNode head) {
        Stack<Integer> stack=new Stack<Integer>();
        while(head!=null){
            stack.push(head.val);
            head=head.next; 
        }
        int sum=0;
        int count=0;
        while(!stack.isEmpty()){
            int i=stack.pop();
            if(i==1){
                sum=sum+(int)Math.pow(2,count);
            }
            count++;
        }
        return sum;
    }
}
