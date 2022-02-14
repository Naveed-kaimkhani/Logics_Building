interface LinkedListQueue{
    public void add(Object obj);
    public Object first();
    public void remove();
    public int size();
    
}

public class Queue implements LinkedListQueue{
    Node head=new Node();
    int size;

    public class Node {
        Object data;
        Node next;
        Node prev;

        Node(){} 
        Node(Object data){
            this.data=data;
        }
        Node(Object data,Node next,Node prev){
           this.data=data;
           this.next=next;
           this.prev=prev;
        }
   }
           
   public void add(Object obj) {
    if (head.next==null) {
      head.next.data=obj;
      head.prev=head.next;
      ++size;  
    }
    else{
        head.prev=head.prev.next=new Node(obj,head,head.prev);
        ++size;
    }
}
public Object first() {
  if (head.next==null) {
      throw new IllegalStateException("Queue is empty");
  } else {
      return head.next.data;
  }  
}

public void remove() {
    if (head.next==null) {
        throw new IllegalStateException("Queue is empty");
    } else {
        head.next=head.next.next;
        --size;
    }  
  }
  public int size() {
    if (head.next==null) {
        throw new IllegalStateException("Queue is empty");
    } else {
        return size;
    }  
  }
  

}