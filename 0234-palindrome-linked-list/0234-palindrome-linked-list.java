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
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode temp = head;
        while(temp != null){
            ListNode front = temp.next;

            temp.next  = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    public boolean isValid(ListNode list1, ListNode list2){
        while(list1 != null && list2 != null){
            if(list1.val != list2.val){
                return false;
            }
            list1 = list1.next;
            list2 = list2.next;
        }
        return true;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while( fast != null && fast.next != null && fast.next.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        } 

        ListNode temp = slow.next;
        slow.next =  null;

        ListNode newHead = reverse(temp);
        
        return isValid(head,newHead);
        
    }
}