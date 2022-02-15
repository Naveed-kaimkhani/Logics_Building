interface LinkedListQueue{
    public void add(Object obj);
    public Object first();
    public Object remove();
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
    @Override           
   public void add(Object data) {
    if (this.head.next==null) {
      head.next=new Node(data);
      head.prev=head.next;
      ++size;  
        System.out.println(data+" added");
    }
    else{
        head.prev=head.prev.next=new Node(data,head,head.prev);
        ++size;
        System.out.println(data+" added");
    }
}
@Override
public Object first() {
  if (head.next==null) {
      throw new IllegalStateException("Queue is empty");
  } else {
      return head.next.data;

  }  
}
@Override
public Object remove() {
    if (head.next==null) {
        throw new IllegalStateException("Queue is empty");
    } else {
        head.next=head.next.next;
        --size;
    }  
    return head.next.data;
  }
  @Override
  public int size() {
    if (head.next==null) {
        throw new IllegalStateException("Queue is empty");
    } else {
        return size;
    }  
  }
  
  public void to() {
    if (head.next==null) 
        throw new IllegalStateException("Queue is empty");
        
    
    else{
          //String str="";
    for (Node i = head.next; i != head.prev.next; i=i.next) {
        System.out.print(i.data+" ");
    }
    }
}
public boolean search(Object obj) {
    if (head.next==null) 
        {
            throw new IllegalStateException("Queue is empty");
            
        }
    else{
          //String str="";
    for (Node i = head.next; i != head.prev.next; i=i.next) {
        if (obj==i.data) {
           return true;
        }
    }
    return false;
    }
}
  public static void main(String[] args) {
      Queue que=new Queue();
      //que.size();
      System.out.println();
      que.add(2);
      que.add(3);
      que.add(4);
      que.add(5);
      //que.to();
      System.out.println();
    //System.out.println(que.size());

       //System.out.println(que.first());
    //System.out.println( que.remove());
     
  //   que.toString();
    System.out.println(que.search(6));
    }
}