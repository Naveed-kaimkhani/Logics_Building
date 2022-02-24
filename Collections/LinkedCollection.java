
public class LinkedCollection  extends AbstractCollection
{
    public static class Node
    {
        Object object;
        Node pre, next;

        public Node()
        {
            pre = next = this;
        }

        public Node(Object object, Node next, Node pre)
        {
            this.object = object;
            this.pre = pre;
            this.next = next;
        }
    }

    private int size;
    private Node head = new Node();

    public int size()
    {
        return size;
    }

    public boolean add(Object obj) {
        head.pre = head.pre.next = new Node(obj, head, head.pre);
        ++size;
        return true;
    }

    public Iterator iterator()
    {
        return new Iterator()
        {
            private Node cursor = head.next;
            private boolean okToRemove = false;

            public boolean hasNext()
            {
                return cursor != head;
            }

            public Object next()
            {
                if (cursor == head) throw new RuntimeException();

                Object temp = cursor.object;
                okToRemove = true;
                cursor = cursor.next;
                return temp;
            }

            public void remove ()
            {
                if (!okToRemove) throw new IllegalStateException();

                cursor.pre = cursor.pre.pre;
                cursor.pre.next = cursor;
                --size;
                okToRemove = false;

            }

        };

    }
}
