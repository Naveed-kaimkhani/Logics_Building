interface Queue{
    public void add(Object o);
    public Object remove();
}
public class LinkedQueue implements Queue{
   Node head=new Node(null);
    private int size;
    private static class Node{
        Object data;
        Node prev;
        Node next;
        
        Node(){}
        Node(Object data){
            this.data=data;
        }
        Node(Object data,Node prev, Node next){
            this.data=data;
            this.prev=prev;
            this.next=next;
        }
    }
    public void add(Object data){
        if (this.head.next==null) {
            head.next=new Node(data);
            head.prev=head.next;
            ++size;
        } else {
        head.prev=head.prev.next=new Node(data,head,head.prev);
        ++size;
        }
    }
    public Object first(){
        if (size<=0) {
            throw new IllegalStateException("Queue is empty");
        }
        else{
            return head.next.data;
        }

    }
    public Object remove() {
        if (head.next==null) {
            throw new IllegalStateException("Queue is empty");
        }
        Node first=head.next;
        head.next=head.next.next;
        size--;  
        return first.data;      
    }
    public void printQue() {
        for (Node i = head.next; i.next != null; i=i.next) {
            System.out.print(i.data+" ");
        }
    }
    public int size() {
        return size;
    }
    public void merge(LinkedQueue que1,LinkedQueue que2) {
        Node i;
        for (Node j = que1.head; j.next!=null; j=j.next) {
            
        }
        for (i = que2.head; i!=null; i=i.next) {
            que1.add(i.next);
        }
    }
    public static void main(String[] args) {
        LinkedQueue que=new LinkedQueue();
        que.add(2);
        que.add(4);
        que.add(6);
        que.add(8);

        que.size();
        que.printQue();
        que.remove();
        que.printQue();

    }
}
