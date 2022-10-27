import java.util.Stack;

public class 回文链表_20220709 {
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
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(2);
        ListNode listNode4 = new ListNode(1);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        isPalindrome(listNode1);

    }



        static boolean isPalindrome(ListNode head) {
            Stack<Integer> stack = new Stack();
            ListNode cur = head;
            while (cur != null){
                stack.push(head.val);
                cur = cur.next;
            }

            while(!stack.isEmpty()){
                if(stack.peek() != head.val){
                    return false;
                }
                stack.pop();
                head = head.next;
            }
            return true;
        }
}
