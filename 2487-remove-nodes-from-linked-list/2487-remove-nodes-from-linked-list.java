/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
      public ListNode reverseList(ListNode head) {
        
       if(head==null || head.next==null) return head;
ListNode newHead=reverseList(head.next);        
ListNode front=head.next;
front.next=head;
head.next=null;
return newHead;
    }
    public ListNode removeNodes(ListNode head) {
        head = reverseList(head);
        ListNode newHead= new ListNode(-1);
        ListNode temp=newHead;
        Deque<Integer> st = new ArrayDeque<>();
        while(head != null){
           if(st.isEmpty()){
            st.push(head.val);
           }else{
            if(head.val >= st.peek()){
             st.push(head.val);
            }
           }
           head=head.next;
        }
        while(!st.isEmpty()){
            temp.next = new ListNode(st.pop());
            temp = temp.next;
        }
        return newHead.next;
    }
}