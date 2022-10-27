public class 合并两个有序链表_20220310 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0), cur = res;
        while (l1 != null && l2 != null) {
            l1 = l1;
            l2 = l2;
            if (l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur=cur.next;
        }
        cur.next = l1 == null? l2 : l1;
        return res.next;
    }
}
