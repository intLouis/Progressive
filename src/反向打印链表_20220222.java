import java.util.Stack;

public class 反向打印链表_20220222 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public 反向打印链表_20220222() {
    }

    public int[] reversePrint(ListNode head) {
        Stack<Integer> objects = new Stack<Integer>();
        while (head != null) {
            objects.push(head.val);
            head = head.next;
        }
        int[] result = new int[objects.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = objects.pop();
        }
        return result;
    }
}
