public class 删除链表的节点_20220307 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteNode(ListNode head, int val) {
        ListNode start = head;
        ListNode pre = null;
        while (start != null) {
            if (start.val == val) {
                if (pre == null) {
                    return start.next;
                }
                pre.next = start.next;
            }
            //记录前一个节点
            pre = start;
            start = start.next;
        }
        return head;
    }
}
