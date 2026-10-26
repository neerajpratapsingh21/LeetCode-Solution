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
    public ListNode deleteDuplicates(ListNode head) {
        Map<Integer,Integer> map = new HashMap<>();
        ListNode temp = head;
        while(temp != null){
            map.put(temp.val,map.getOrDefault(temp.val,0)+1);
            temp = temp.next;
        }
        temp = head;
        ListNode dummy = new ListNode(-1);
         ListNode t=dummy;
        while(temp != null){
            if(map.get(temp.val) == 1){
                ListNode newNode = new ListNode(temp.val);
                t.next = newNode;
                t=t.next;
            }
            temp = temp.next;
        }
        t.next = null;
return dummy.next;
            }
}