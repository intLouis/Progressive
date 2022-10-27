

public class 删除排序链表中的重复元素II_20220818 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(1);
//        ListNode listNode3 = new ListNode(3);
//        ListNode listNode4 = new ListNode(3);
//        ListNode listNode5 = new ListNode(4);
//        ListNode listNode6 = new ListNode(4);
//        ListNode listNode7 = new ListNode(5);
        listNode1.next = listNode2;
//        listNode2.next = listNode3;
//        listNode3.next = listNode4;
//        listNode4.next = listNode5;
//        listNode5.next = listNode6;
//        listNode6.next = listNode7;

        deleteDuplicates(listNode1);
    }

    static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        if(head.next.next !=null) return head.next.val == head.next.next.val ? null : head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode slow = head;
        ListNode fast = slow.next;
        while (fast != null && fast.next != null) {

            if (slow.val != fast.val) {
                pre = slow;
                fast = fast.next;
                slow = slow.next;
            } else {
                while (fast != null && fast.val == slow.val) {
                    fast = fast.next;
                }
                pre.next = fast;
                slow = fast;
                if ( fast !=null && fast.next != null) fast = fast.next;
            }
        }
        return dummy.next;
    }
}
