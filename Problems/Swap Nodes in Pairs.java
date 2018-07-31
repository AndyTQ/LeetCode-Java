/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head; //only one node
        /*************************************************************************/
        ListNode new_head = head.next;
        ListNode cur_node = head;
        ListNode temp;
        
        while (cur_node != null){
            /* One case is that the pointer is reaching the, "last part" of the entire list, and the "last part" consists of only                 
                   one node. */
            /* The other case is that we have a pair of nodes available to swap*/
            // System.out.println(cur_node);
            if (cur_node.next != null) {
                temp = cur_node.next.next;
                cur_node.next.next = cur_node;
                if (temp == null || temp.next == null){
                    cur_node.next = temp;
                } else {
                    cur_node.next = temp.next;
                }
                cur_node = temp;
            }
            else {
                cur_node = cur_node.next; // i.e. ends the loop
            }
        }
        
        return new_head;
    }
}
