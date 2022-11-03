public class 链表反转_20221104 {

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
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node6.next = node6;

        reverseList(node1);

    }

    public static ListNode reverseList(ListNode head) {
        ListNode pre = new ListNode(0);
        while (head != null) {
            ListNode temp = head.next;
            head.next = pre;

            pre = head;
            head = temp;
        }
        return pre;
    }
}
