import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(2, 1);
        lruCache.put(1, 1);
        lruCache.put(2, 3);
        lruCache.put(4, 1);
        lruCache.get(1);
        lruCache.get(2);
//        lruCache.put(4,4);
//        lruCache.get(1);
//        lruCache.get(3);
//        lruCache.get(4);
    }

    class Node {
        public Node prev, next;
        public int key, val;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    Map<Integer, Node> map = new HashMap<>();
    int n;
    Node head, tail;

    public LRUCache(int capacity) {
        //初始化一组初始节点
        n = capacity;
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
        printListNode();

    }

    public int get(int key) {

        if (map.containsKey(key)) {
            Node node = map.get(key);
            removeNode(node);
            Node node1 = insertToHead(node.key, node.val);
            printListNode();
            System.out.println(node1.val);
            return node1.val;
        } else {
            printListNode();
            return -1;
        }

    }

    public void put(int key, int value) {
        //如果超过最大容量，先移除尾节点，再加入节点到头部
        if (map.containsKey(key)) {
            Node node = map.get(key);
            removeNode(node);
            insertToHead(key, value);
        } else {
            if (map.size() == n) {
                removeNode(tail.prev);
            }
            Node node = insertToHead(key, value);
            printListNode();
        }

    }

    /**
     * 移除指定节点
     *
     * @param node
     */
    public void removeNode(Node node) {

        Node curPrev = node.prev;
        Node curNext = node.next;
        curPrev.next = curNext;
        curNext.prev = curPrev;
        node.prev = null;
        node.next = null;
        map.remove(node.key);
    }

    /**
     * 插入到头结点
     *
     * @param key
     * @param value
     */
    public Node insertToHead(int key, int value) {
        Node newNode = new Node(key, value);
        //第二个节点
        Node theSecondNode = head.next;
        theSecondNode.prev = newNode;
        newNode.next = theSecondNode;
        head.next = newNode;
        newNode.prev = head;
        map.put(key, newNode);
        return newNode;
    }

    void printListNode() {
        System.out.println();
        Node cur = head;
        while (cur != null) {
            System.out.printf("(" + cur.key + ", " + cur.val + ")" + "->");
            cur = cur.next;
        }
    }
}
