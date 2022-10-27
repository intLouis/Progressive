public class 两个链表得第一个公共节点_20220312 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tmp1 = headA;
        ListNode tmp2 = headB;

        while (tmp1 != tmp2) {
            if (tmp1 == null) {
                tmp1 = headB;
            }else {
                tmp1 = tmp1.next;
            }

            if (tmp2 == null) {
                tmp2 = headA;
            }else {
                tmp2 = tmp2.next;
            }

        }
        return tmp1;
    }
}