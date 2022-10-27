public class 反转链表_20220221 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        反转链表_20220221 反转链表_20220221 = new 反转链表_20220221();
        ListNode listNode1 = new ListNode(5);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(3);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        反转链表_20220221.reverseList(listNode1);
    }
    public 反转链表_20220221() {



    }

    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while (cur.next != null) {
            //用中继节点tmp记录下一个节点
            ListNode tmp = cur.next;
            //反转当前节点
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return cur;
    }
}
