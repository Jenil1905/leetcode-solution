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
    public ListNode swapNodes(ListNode head, int k) {
        int size = 0;
        ListNode temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        int reversedIdx = size-k;
        ListNode front = head;
        int left = 0;
        while(left<k-1){
            front = front.next;
            left++;
        }
        ListNode back = head;
        int right = 0;
        while(right<reversedIdx){
            back = back.next;
            right++;
        }
        int tempVal = front.val;
        front.val = back.val;
        back.val = tempVal;
        return head;
    }
}