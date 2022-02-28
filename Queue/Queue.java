import java.rmi.server.ObjID;

interface LinkedListQueue {
    public void add(Object obj);

    public Object first();

    public Object remove();

    public int size();

}

public class Queue implements LinkedListQueue {
    Node head = new Node();
    int size;

    public class Node {
        Object data;
        Node next;
        Node prev;

        Node() {
        }

        Node(Object data) {
            this.data = data;
        }

        Node(Object data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    @Override
    public void add(Object data) {
        if (this.head.next == null) {
            head.next = new Node(data);
            head.prev = head.next;
            ++size;
            System.out.println(data + " added ");
        } else {
            head.prev = head.prev.next = new Node(data, head, head.prev);
            ++size;
            System.out.println(data + " added ");
        }
    }

    @Override
    public Object first() {
        if (head.next == null) {
            throw new IllegalStateException("Queue is empty");
        } else {
            return head.next.data;

        }
    }

    @Override
    public Object remove() {
        if (head.next == null) {
            throw new IllegalStateException("Queue is empty");
        } else {
            head.next = head.next.next;
            --size;
        }
        return head.next.data;
    }

    @Override
    public int size() {
        if (head.next == null) {
            throw new IllegalStateException("Queue is empty");
        } else {
            return size;
        }
    }

    public void to() {
        if (head.next == null)
            throw new IllegalStateException("Queue is empty");

        else {
            // String str="";
            for (Node i = head.next; i != head.prev.next; i = i.next) {
                System.out.print(i.data + " ");
            }
        }
    }

    public boolean search(Object obj) {
        if (head.next == null) {
            throw new IllegalStateException("Queue is empty");

        } else {
            // String str="";
            for (Node i = head.next; i != head.prev.next; i = i.next) {
                if (obj == i.data) {
                    return true;
                }
            }
            return false;
        }
    }

    public Queue reverse() {
        Queue q2 = new Queue();
        for (Node i = head.prev; i != head.next; i = i.prev) {
            q2.add(i.data);
        }
        return q2;
    }

    public Queue merge(Queue q1, Queue q2) {
        q1.head.prev.next = q2.head.next;
        q2.head.prev = q1.head;
        q1.head.prev = q2.head.prev;
        q2.head.prev.next = q1.head;

        return q1;

    }

    public void toArray(Queue que) {
        int length = size;
        Object[] arr = new Object[length];
        int j = 0;
        for (Node i = que.head.next; i != head.prev; i = i.next) {
            arr[j] = i.data;
            j++;
        }
        for (Object ele : arr) {
            System.out.println(ele);
        }
    }

    public static void main(String[] args) {
        Queue que = new Queue();
        // que.size();
        System.out.println();
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);

        Queue que1 = new Queue();
        // que.size();
        System.out.println();
        que1.add(6);
        que1.add(7);
        que1.add(8);
        que1.add(9);

        Queue q3 = new Queue();
        // q3.
        que1.merge(que, que1);
        // q3=que.reverse();
        q3.to();
    }
}