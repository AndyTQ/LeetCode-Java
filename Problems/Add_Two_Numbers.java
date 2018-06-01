class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode cur_node_1 = l1, cur_node_2 = l2, sum = null, new_cur_node = null;
        int carry = 0;
        while (cur_node_1 != null || cur_node_2 != null){
            int v1, v2;
            v1 = (cur_node_1 == null) ? 0 : cur_node_1.val;
            v2 = (cur_node_2 == null) ? 0 : cur_node_2.val;
            if (v1 + v2 + carry >= 10){
                if (sum == null){
                    sum = new ListNode(v1 + v2 + carry - 10);
                    new_cur_node = sum;
                }
                else{
                    new_cur_node.next = new ListNode(v1 + v2 + carry - 10);
                    new_cur_node = new_cur_node.next;
                }
                carry = 1;
            }
            else {
                if (sum == null){
                    sum = new ListNode(v1 + v2 + carry);
                    new_cur_node = sum;
                } else {
                    new_cur_node.next = new ListNode(v1 + v2 + carry);
                    new_cur_node = new_cur_node.next;
                }
                carry = 0;
            }
            if (cur_node_1 != null) cur_node_1 = cur_node_1.next;
            if (cur_node_2 != null) cur_node_2 = cur_node_2.next;
        }
        if(carry == 1) new_cur_node.next = new ListNode(1);
        return sum;
    }
}
